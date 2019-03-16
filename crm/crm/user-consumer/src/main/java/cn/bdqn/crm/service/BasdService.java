package cn.bdqn.crm.service;

import cn.bdqn.crm.dto.Page;
import cn.bdqn.crm.vo.BasDictVo;

import java.util.List;
import java.util.Map;

public interface BasdService {

    List<BasDictVo> findAll();

    Page<BasDictVo> findByPage(Map<String, Object> mapCondition);
}
