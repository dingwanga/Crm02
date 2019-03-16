package cn.bdqn.crm.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class SysUserVo implements Serializable {
    //系统用户编号
    @ApiModelProperty(name = "tokenId",notes="redis中的token")
    private String tokenId;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    //系统用户编号
    @ApiModelProperty(name = "userId",required = true,notes="系统用户编号")
    private Integer userId;
    //用户登录名
    @ApiModelProperty(name = "userName",required = true,notes="系统用户登录名")
    private String userName;
    //用户登录密码
    @ApiModelProperty(name = "userPassword",required = true,notes="系统登录密码")
    private String userPassword;
    //角色名字
    private String userRole;
    //用户状态
    private Integer userFlag;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return this.userRole;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }

    public Integer getUserFlag() {
        return this.userFlag;
    }

}
