package cn.bdqn.crm.service;

import cn.bdqn.crm.client.BasDictClient;
import cn.bdqn.crm.dto.Page;
import cn.bdqn.crm.pojo.BasDict;
import cn.bdqn.crm.vo.BasDictVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("basdService")
public class BasdServiceImpl implements BasdService {

    @Autowired
    private BasDictClient basDictClient;

    @Override
    public List<BasDictVo> findAll() {
        List<BasDictVo> list = new ArrayList<>();
        List<BasDict> basDictList = basDictClient.findAll();
        if(basDictList.size()>0){
            for (BasDict dict:basDictList) {
                BasDictVo bvo = new BasDictVo();
                bvo.setDictId(dict.getDictId());
                bvo.setDictItem(dict.getDictItem());
                bvo.setDictType(dict.getDictType());
                bvo.setDictValue(dict.getDictValue());
                String ret = dict.getDictIsEditable()==0?"否":"是";
                bvo.setIsEditable(ret);
                list.add(bvo);
            }
            return list;
        }else{
            return null;
        }

    }

    @Override
    public Page<BasDictVo> findByPage(Map<String, Object> mapCondition) {
        // mapCondition.put("pageNo",1);
        //            mapCondition.put("pageSize",5);
        //            mapCondition.put("dictType",null);
        //            mapCondition.put("dictItem",null);
        //            mapCondition.put("dictValue",null);
        int curpage = (Integer) mapCondition.get("pageNo");
        Integer pagesize = (Integer)mapCondition.get("pageSize");
        Integer total = basDictClient.getTotalCountByMap(mapCondition);
        Page<BasDictVo> pageBean = new Page<>(curpage,pagesize,total);
        mapCondition.put("beginPos",pageBean.getBeginPos());
        List<BasDict> pageList = basDictClient.findByPage(mapCondition);
        List<BasDictVo> list = new ArrayList<>();
        if(pageList.size()>0){
            for (BasDict dict:pageList) {
                BasDictVo bvo = new BasDictVo();
                bvo.setDictId(dict.getDictId());
                bvo.setDictItem(dict.getDictItem());
                bvo.setDictType(dict.getDictType());
                bvo.setDictValue(dict.getDictValue());
                String ret = dict.getDictIsEditable()==0?"否":"是";
                bvo.setIsEditable(ret);
                list.add(bvo);
            }
        }
        pageBean.setRows(list);
        return pageBean;
    }
}
