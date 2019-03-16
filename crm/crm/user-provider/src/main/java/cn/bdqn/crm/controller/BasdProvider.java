package cn.bdqn.crm.controller;

import cn.bdqn.crm.mapper.BasDictMapper;
import cn.bdqn.crm.pojo.BasDict;
import cn.bdqn.crm.vo.BasDictVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/basd")
public class BasdProvider {

    @Autowired
    private BasDictMapper basDictMapper;

    @GetMapping("/findAll")
    public List<BasDict> findAll(){
        try {
            List<BasDict> list =  basDictMapper.getBasDictListByMap(null);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/getTotalCountByMap")
    public Integer getTotalCountByMap(@RequestBody Map<String, Object> mapCondition){
        try {
            return basDictMapper.getTotalCountByMap(mapCondition);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @PostMapping("/findByPageList")
    public List<BasDict> findByPage(@RequestBody Map<String, Object> mapCondition){
        try {
            return basDictMapper.getBasDictListByMap(mapCondition);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
