package com.shanyu.mapper;

import com.shanyu.pojo.CustActivity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CustActivityMapper {

    @Insert("INSERT INTO cst_activity (atv_cust_no,atv_date,atv_place,atv_title,atv_desc,atv_memo) VALUES " +
            "(#{atv_cust_no},#{atv_date},#{atv_place},#{atv_title},#{atv_desc},#{atv_memo})")
    public int add(CustActivity activity);

    @Delete("DELETE FROM cst_activity WHERE atv_id=#{atv_id}")
    public int del(int id);

    @Update("UPDATE cst_activity a SET a.`atv_date`=#{atv_date},a.`atv_place`=#{atv_place},a.`atv_title`=#{atv_title}," +
            "a.`atv_desc`=#{atv_desc},a.`atv_memo`=#{atv_memo} WHERE a.`atv_id`=#{atv_id}")
    public int update(CustActivity activity);

    @Select("SELECT a.`atv_id`,a.`atv_cust_no`,c.`cust_name` AS 'atv_cust_name',a.`atv_date`,a.`atv_place`,a.`atv_title`,a.`atv_desc`,a.`atv_memo` FROM cst_activity a " +
            "LEFT JOIN cst_customer c ON a.`atv_cust_no`=c.`cust_no` WHERE a.`atv_id`=#{id}")
    public CustActivity getById(int id);

    @Select("SELECT a.`atv_id`,a.`atv_cust_no`,c.`cust_name` AS 'atv_cust_name',a.`atv_date`,a.`atv_place`,a.`atv_title`,a.`atv_desc`,a.`atv_memo` FROM cst_activity a " +
            "LEFT JOIN cst_customer c ON a.`atv_cust_no`=c.`cust_no` WHERE a.`atv_cust_no`=#{cust_no} ORDER BY a.`atv_date`")
    public List<CustActivity> getListByCustNo(@Param("cust_no") String cust_no);

}
