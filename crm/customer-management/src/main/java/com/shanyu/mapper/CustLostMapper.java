package com.shanyu.mapper;

import com.shanyu.pojo.CustLost;
import com.shanyu.pojo.CustLostParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CustLostMapper {

    @Insert("INSERT INTO cst_lost (lst_cust_no,lst_status) VALUES (#{lst_cust_no},1)")
    public int add(CustLost lost);

    @Update("<script>UPDATE cst_lost l <set> " +
            "<if test='lst_date!=null'>l.`lst_date`=#{lst_date}, </if>" +
            "<if test='lst_delay!=null'>l.`lst_delay`=#{lst_delay}, </if>" +
            "<if test='lst_reason!=null'>l.`lst_reason`=#{lst_reason}, </if>" +
            "<if test='lst_status!=null'>l.`lst_status`=#{lst_status}, </if></set>" +
            "WHERE l.`lst_id`=#{lst_id}</script>")
    public int update(CustLost lost);

    @Select("SELECT l.`lst_id`,l.`lst_cust_no`,c.`cust_name` AS 'lst_cust_name',c.`cust_manager_id` AS 'lst_manager_id', " +
            "u.`usr_name` AS 'lst_manager_name',l.`lst_date`,l.`lst_delay`,l.`lst_reason`,l.`lst_status`, " +
            "(SELECT o.`odr_date` FROM `order` o WHERE o.`odr_cust_no`=l.`lst_cust_no` ORDER BY o.`odr_date` DESC LIMIT 1) AS lst_last_order FROM cst_lost l " +
            "LEFT JOIN cst_customer c ON l.`lst_cust_no`=c.`cust_no` " +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id` " +
            "where l.`lst_id`=#{id}")
    public CustLost getById(@Param("id") int id);

    @Select("<script>SELECT COUNT(l.`lst_id`) FROM cst_lost l " +
            "LEFT JOIN cst_customer c ON l.`lst_cust_no`=c.`cust_no`" +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id`" +
            "<where>" +
            "<if test='lst_cust_name!=null'> and c.`cust_name` like concat('%',#{lst_cust_name},'%') </if>" +
            "<if test='lst_manager_name!=null'> and u.`usr_name` like concat('%',#{lst_manager_name},'%') </if>" +
            "<if test='lst_status!=0'> and l.`lst_status`=#{lst_status} </if>" +
            "</where></script>")
    public int getCount(CustLostParam param);

    @Select("<script>SELECT l.`lst_id`,l.`lst_cust_no`,c.`cust_name` AS 'lst_cust_name',c.`cust_manager_id` AS 'lst_manager_id'," +
            "u.`usr_name` AS 'lst_manager_name',l.`lst_date`,l.`lst_delay`,l.`lst_reason`,l.`lst_status`," +
            "(SELECT o.`odr_date` FROM `order` o WHERE o.`odr_cust_no`=l.`lst_cust_no` ORDER BY o.`odr_date` DESC LIMIT 1) AS lst_last_order FROM cst_lost l " +
            "LEFT JOIN cst_customer c ON l.`lst_cust_no`=c.`cust_no`" +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id`" +
            "<where>" +
            "<if test='lst_cust_name!=null'> and c.`cust_name` like concat('%',#{lst_cust_name},'%') </if>" +
            "<if test='lst_manager_name!=null'> and u.`usr_name` like concat('%',#{lst_manager_name},'%') </if>" +
            "<if test='lst_status!=0'> and l.`lst_status`=#{lst_status} </if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<CustLost> getList(CustLostParam param);

    @Select("<script>SELECT COUNT(l.`lst_id`) FROM cst_lost l " +
            "LEFT JOIN cst_customer c ON l.`lst_cust_no`=c.`cust_no`" +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id`" +
            "<where> l.`lst_status`=3 " +
            "<if test='lst_cust_name!=null'> and c.`cust_name` like concat('%',#{lst_cust_name},'%') </if>" +
            "<if test='lst_manager_name!=null'> and u.`usr_name` like concat('%',#{lst_manager_name},'%') </if>" +
            "</where></script>")
    public int getLostsCount(CustLostParam param);

    @Select("<script>SELECT l.`lst_id`,l.`lst_cust_no`,c.`cust_name` AS 'lst_cust_name',c.`cust_manager_id` AS 'lst_manager_id'," +
            "u.`usr_name` AS 'lst_manager_name',l.`lst_date`,l.`lst_delay`,l.`lst_reason`,l.`lst_status`," +
            "(SELECT o.`odr_date` FROM `order` o WHERE o.`odr_cust_no`=l.`lst_cust_no` ORDER BY o.`odr_date` DESC LIMIT 1) AS lst_last_order FROM cst_lost l " +
            "LEFT JOIN cst_customer c ON l.`lst_cust_no`=c.`cust_no`" +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id`" +
            "<where> l.`lst_status`=3 " +
            "<if test='lst_cust_name!=null'> and c.`cust_name` like concat('%',#{lst_cust_name},'%') </if>" +
            "<if test='lst_manager_name!=null'> and u.`usr_name` like concat('%',#{lst_manager_name},'%') </if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<CustLost> getLosts(CustLostParam param);
}
