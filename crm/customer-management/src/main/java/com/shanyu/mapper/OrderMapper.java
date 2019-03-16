package com.shanyu.mapper;

import com.shanyu.pojo.Order;
import com.shanyu.pojo.OrderParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface OrderMapper {

    @Select("SELECT o.`odr_id`,o.`odr_cust_no`,o.`odr_date`,o.`odr_addr`,o.`odr_status`,(SELECT SUM(l.`odl_price`) FROM odr_line l WHERE l.`odl_odr_id`=o.`odr_id` ) AS 'odr_amount' FROM `order` o WHERE o.`odr_id`=#{id}")
    public Order getById(@Param("id") int id);

    @Select("SELECT COUNT(o.`odr_id`) FROM `order` o WHERE o.`odr_cust_no`=#{odr_cust_no}")
    public int getCount(OrderParam param);

    @Select("SELECT o.`odr_id`,o.`odr_cust_no`,o.`odr_date`,o.`odr_addr`,o.`odr_status` FROM `order` o WHERE o.`odr_cust_no`=#{odr_cust_no} LIMIT #{from},#{pageSize}")
    public List<Order> getList(OrderParam param);
}
