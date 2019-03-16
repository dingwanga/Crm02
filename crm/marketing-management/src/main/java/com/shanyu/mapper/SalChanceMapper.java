package com.shanyu.mapper;

import com.shanyu.pojo.SalChance;
import com.shanyu.pojo.SalChanceParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SalChanceMapper {

    @Insert("insert into sal_chance (chc_source,chc_cust_name,chc_title,chc_rate,chc_linkman,chc_tel,chc_desc,chc_create_id,chc_create_date,chc_status) " +
            "values (#{chc_source},#{chc_cust_name},#{chc_title},#{chc_rate},#{chc_linkman},#{chc_tel},#{chc_desc},#{chc_create_id},#{chc_create_date},#{chc_status})")
    public int add(SalChance chance);

    @Delete("delete from sal_chance where chc_id=#{id}")
    public int del(@Param("id") int id);

    @Update("<script>update sal_chance <set>" +
            "<if test='chc_source!=null'>chc_source=#{chc_source},</if>" +
            "<if test='chc_cust_name!=null'>chc_cust_name=#{chc_cust_name},</if>" +
            "<if test='chc_title!=null'>chc_title=#{chc_title},</if>" +
            "<if test='chc_rate!=null'>chc_rate=#{chc_rate},</if>" +
            "<if test='chc_linkman!=null'>chc_linkman=#{chc_linkman},</if>" +
            "<if test='chc_tel!=null'>chc_tel=#{chc_tel},</if>" +
            "<if test='chc_desc!=null'>chc_desc=#{chc_desc},</if>" +
            "<if test='chc_due_id!=null'>chc_due_id=#{chc_due_id},</if>" +
            "<if test='chc_due_date!=null'>chc_due_date=#{chc_due_date},</if>" +
            "<if test='chc_status!=null'>chc_status=#{chc_status},</if>" +
            "</set>where chc_id=#{chc_id}</script>")
    public int update(SalChance chance);

    @Select("SELECT c.`chc_id`,c.`chc_source`,c.`chc_cust_name`,c.`chc_title`,c.`chc_rate`,c.`chc_linkman`,c.`chc_tel`," +
            "c.`chc_desc`,c.`chc_create_id`,u1.`usr_name` AS `chc_create_by`,c.`chc_create_date`,c.`chc_due_id`," +
            "u2.`usr_name` AS `chc_due_to`,c.`chc_due_date`,c.`chc_status`,d.`dict_item` as 'chc_status_value' FROM sal_chance c " +
            "LEFT JOIN sys_user u1 ON c.`chc_create_id`=u1.`usr_id` " +
            "LEFT JOIN sys_user u2 ON c.`chc_due_id`=u2.`usr_id` " +
            "LEFT JOIN bas_dict d ON c.`chc_status`=d.`dict_value` AND d.`dict_type`='chc_status'" +
            "where c.`chc_id`=#{id}")
    public SalChance getById(@Param("id") int id);

    @Select("<script>SELECT COUNT(c.`chc_id`) FROM sal_chance c " +
            "<where>" +
            "<if test='chc_cust_name!=null'>and chc_cust_name like concat ('%',#{chc_cust_name},'%') </if>" +
            "<if test='chc_title!=null'>and chc_title like concat ('%',#{chc_title},'%') </if>" +
            "<if test='chc_linkman!=null'>and chc_linkman like concat ('%',#{chc_linkman},'%') </if>" +
            "<if test='chc_due_id!=null'>and chc_due_id=#{chc_due_id} </if>" +
            "</where></script>")
    public int getCount(SalChanceParam param);

    @Select("<script>SELECT c.`chc_id`,c.`chc_source`,c.`chc_cust_name`,c.`chc_title`,c.`chc_rate`,c.`chc_linkman`,c.`chc_tel`,c.`chc_desc`,c.`chc_create_id`,u1.`usr_name` AS `chc_create_by`,c.`chc_create_date`,c.`chc_due_id`,u2.`usr_name` AS `chc_due_to`,c.`chc_due_date`,c.`chc_status`,d.`dict_item` as 'chc_status_value' FROM sal_chance c " +
            "LEFT JOIN sys_user u1 ON c.`chc_create_id`=u1.`usr_id` " +
            "LEFT JOIN sys_user u2 ON c.`chc_due_id`=u2.`usr_id`" +
            "LEFT JOIN bas_dict d ON c.`chc_status`=d.`dict_value` AND d.`dict_type`='chc_status' " +
            "<where>" +
            "<if test='chc_cust_name!=null'>and chc_cust_name like concat ('%',#{chc_cust_name},'%') </if>" +
            "<if test='chc_title!=null'>and chc_title like concat ('%',#{chc_title},'%') </if>" +
            "<if test='chc_linkman!=null'>and chc_linkman like concat ('%',#{chc_linkman},'%') </if>" +
            "<if test='chc_due_id!=null'>and chc_due_id=#{chc_due_id} </if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<SalChance> getByParam(SalChanceParam param);
}
