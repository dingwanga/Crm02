package com.shanyu.mapper;

import com.shanyu.pojo.Contr;
import com.shanyu.pojo.ContrParam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ContrMapper {

    @Select("<script>SELECT SUM(l.`odl_price`) AS 'total',o.`odr_cust_no` AS 'cust_no',c.`cust_name` AS 'cust_name' FROM odr_line l " +
            "LEFT JOIN `order` o ON o.`odr_id`=l.`odl_odr_id` " +
            "LEFT JOIN cst_customer c ON c.`cust_no`=o.`odr_cust_no` " +
            "<where>" +
            "<if test='cust_name!=null'> and c.`cust_name` LIKE concat('%',#{cust_name},'%') </if>" +
            "<if test='date!=0'> AND YEAR(o.`odr_date`)=#{date} </if> " +
            "</where> GROUP BY c.`cust_no` </script>")
    public List<Contr> getList(ContrParam param);
}
