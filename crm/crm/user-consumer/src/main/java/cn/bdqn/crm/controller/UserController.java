package cn.bdqn.crm.controller;

import cn.bdqn.crm.config.RedisUtil;
import cn.bdqn.crm.dto.Dto;
import cn.bdqn.crm.dto.DtoUtil;
import cn.bdqn.crm.pojo.SysRole;
import cn.bdqn.crm.pojo.SysUser;
import cn.bdqn.crm.service.UserService;
import cn.bdqn.crm.vo.SysUserVo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@Api(description = "UserController处理模块")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name="redisUtil")
    private RedisUtil redisUtil;

    @GetMapping("/user/view/{userId}")
    @ApiOperation(value = "findUserById", notes = "根据用户ID查找用户",produces = "application/json")
    public Dto findUserById(
            @ApiParam(name = "userId", required = true, type = "Integer",value ="用户ID")
            @PathVariable(name = "userId")Integer userId){

        return DtoUtil.returnSuccess("成功!");
    }


    @GetMapping("/userLogin/{userName}/{userPassword}")
    @ApiOperation(value = "用户登录userLogin", notes = "用户登录请求",response = Dto.class,httpMethod = "GET",
    protocols = "http",produces = "application/json")
    //非对象参数集
    @ApiImplicitParams({
            //非对象参数描述
            @ApiImplicitParam(name = "userName", required = true, dataType = "String",value ="登录名" ),
            @ApiImplicitParam(name = "userPassword", required = true, dataType = "String",value = "登录密码")
        })
    @ApiResponse(code = 200,message = "正常返回")
    public Dto<SysUserVo> doLogin(
            //@ApiParam(name="userName",required = true,value = "登录名")
            //@RequestParam(name = "userName") String userName,
            @PathVariable(name = "userName")String userName,
           // @ApiParam(name="userPassword",required = true,value = "登录密码")
           // @RequestParam(name = "userPassword") String userPassword) {
            @PathVariable(name = "userPassword")String userPassword){
        //Dto<SysUserVo> dto = new Dto<>();
        SysUser user = userService.doLogin(userName, userPassword);
        if (user != null) {
            //根据userRoleId查询SysRole
            SysRole role = userService.findRoleById(user.getUserRoleId());
            SysUserVo userVo = new SysUserVo();
            userVo.setUserId(user.getUserId());
            userVo.setUserName(user.getUserName());
            userVo.setUserPassword(user.getUserPassword());
            userVo.setUserRole(role.getRoleName());
            userVo.setUserFlag(user.getUserFlag());
            //把用户放入token
            String tokenId = "TOKEN-USER-"+UUID.randomUUID().toString().replace("-","").toUpperCase();
            System.out.println(tokenId);
            userVo.setTokenId(tokenId);
            redisUtil.set(tokenId,userVo,1800);
            return DtoUtil.returnDataSuccess(userVo);
        } else {
            //dto.setErrorCode("0001");
            return DtoUtil.returnSuccess("用户名或密码有误!");
        }

    }
}
