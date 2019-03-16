package com.shanyu.mapper;

import com.shanyu.pojo.Cons;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ConsMapper {

    @Select("SELECT c.`cust_level` AS 'level',d.`dict_item` AS 'item',COUNT(c.`cust_id`) AS 'count' FROM cst_customer c " +
            "LEFT JOIN bas_dict d ON c.`cust_level`=d.dict_value AND d.`dict_type`='企业客户等级' " +
            "GROUP BY c.`cust_level`")
    public List<Cons> getByLevel();

    @Select("SELECT c.`cust_satisfy` AS 'level',d.`dict_item` AS 'item',COUNT(c.`cust_id`) AS 'count' FROM cst_customer c " +
            "LEFT JOIN bas_dict d ON c.`cust_satisfy`=d.`dict_value` AND d.`dict_type`='企业客户满意度' " +
            "GROUP BY c.`cust_satisfy`")
    public List<Cons> getBySatisfy();

    @Select("SELECT c.`cust_credit` AS 'level',d.`dict_item` AS 'item',COUNT(c.`cust_id`) AS 'count' FROM cst_customer c " +
            "LEFT JOIN bas_dict d ON c.`cust_credit`=d.`dict_value` AND d.`dict_type`='企业客户信用度' " +
            "GROUP BY c.`cust_credit`")
    public List<Cons> getByCredit();
}
