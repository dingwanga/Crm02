package cn.bdqn.crm.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.bdqn.crm.dto.Dto;
import cn.bdqn.crm.dto.DtoUtil;
import cn.bdqn.crm.dto.Page;
import cn.bdqn.crm.service.BasdService;
import cn.bdqn.crm.vo.BasDictVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据字典管理
 */
@RestController
@RequestMapping("/basd")
public class BasdController {

    @Autowired
    private BasdService basdService;
    @GetMapping("/dictlist")
    public Dto<BasDictVo> findAll(){
      List<BasDictVo> list =  basdService.findAll();
      if(list!=null&&list.size()>0){
          return DtoUtil.returnSuccess("成功",list);
      }else{
          return DtoUtil.returnFail("没有数据","0001");
      }
    }

    @ApiOperation(value = "findByPage",notes="分页条件查询页面信息:pageNo,pageSize,类别,条目,值")
    @RequestMapping(value = "/findByPage",method = RequestMethod.POST)
    public Dto<Page<BasDictVo>> findByPage(
            @ApiParam(value = "mapCondition 页面信息",required = false)
            @RequestBody(required = false) Map<String,Object> mapCondition){
        System.out.println(mapCondition);
        if(mapCondition==null){
            mapCondition = new HashMap<>();
            mapCondition.put("pageNo",1);
            mapCondition.put("pageSize",5);
            mapCondition.put("dictType",null);
            mapCondition.put("dictItem",null);
            mapCondition.put("dictValue",null);
        }else{
            Integer pageNo = (Integer)mapCondition.get("pageNo");
            Integer pageSize = (Integer)mapCondition.get("pageSize");
            if(pageNo==null)
                pageNo = 1;
            if(pageSize==null)
                pageSize = 5;
            mapCondition.put("pageNo",pageNo);
            mapCondition.put("pageSize",pageSize);
        }
        System.out.println(mapCondition);
        Page<BasDictVo> pageBean = basdService.findByPage(mapCondition);
        return DtoUtil.returnSuccess("成功",pageBean);
    }


}
