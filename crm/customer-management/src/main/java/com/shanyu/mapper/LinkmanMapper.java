package com.shanyu.mapper;

import com.shanyu.pojo.Linkman;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface LinkmanMapper {

    @Insert("INSERT INTO cst_linkman (lkm_cust_no,lkm_name,lkm_sex,lkm_position,lkm_tel,lkm_mobile,lkm_memo) VALUES " +
            "(#{lkm_cust_no},#{lkm_name},#{lkm_sex},#{lkm_position},#{lkm_tel},#{lkm_mobile},#{lkm_memo})")
    public int add(Linkman linkman);

    @Delete("DELETE FROM cst_linkman WHERE lkm_id=#{id}")
    public int del(@Param("id") int id);

    @Update("UPDATE cst_linkman l <set>" +
            "<if test='lkm_name!=null'>l.`lkm_name`=#{lkm_name}, </if>" +
            "<if test='lkm_sex!=null'>l.`lkm_sex`=#{lkm_sex}, </if>" +
            "<if test='lkm_position!=null'>l.`lkm_position`=#{lkm_position}, </if>" +
            "<if test='lkm_tel!=null'>l.`lkm_tel`=#{lkm_tel}, </if>" +
            "<if test='lkm_mobile'>l.`lkm_mobile`=#{lkm_mobile}, </if>" +
            "<if test='lkm_memo'>l.`lkm_memo`=#{lkm_memp} </if> " +
            "</set> WHERE l.`lkm_id`=#{lkm_id}")
    public int update(Linkman linkman);

    @Select("SELECT l.`lkm_id`,l.`lkm_cust_no`,c.`cust_name` AS 'lkm_cust_name',l.`lkm_name`,l.`lkm_sex`,l.`lkm_position`,l.`lkm_tel`,l.`lkm_mobile`,l.`lkm_memo` FROM cst_linkman l " +
            "LEFT JOIN cst_customer c ON l.`lkm_cust_no`=c.`cust_no` where l.`lkm_cust_no`=#{cust_no}")
    public List<Linkman> getByCustNo(@Param("cust_no") String cust_no);

    @Select("SELECT l.`lkm_id`,l.`lkm_cust_no`,c.`cust_name` AS 'lkm_cust_name',l.`lkm_name`,l.`lkm_sex`,l.`lkm_position`,l.`lkm_tel`,l.`lkm_mobile`,l.`lkm_memo` FROM cst_linkman l " +
            "LEFT JOIN cst_customer c ON l.`lkm_cust_no`=c.`cust_no` where l.`lkm_id`=#{id}")
    public Linkman getById(int id);
}
