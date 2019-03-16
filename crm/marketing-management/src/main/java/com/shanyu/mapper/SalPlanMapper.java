package com.shanyu.mapper;

import com.shanyu.pojo.SalPlan;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SalPlanMapper {

    @Insert("insert into sal_plan (pla_chc_id,pla_date,pla_todo,pla_result) " +
            "values (#{pla_chc_id},#{pla_date},#{pla_todo},#{pla_result})")
    public int add(SalPlan plan);

    @Delete("delete from sal_plan where pla_id=#{id}")
    public int del(@Param("id") int id);

    @Delete("delete from sal_plan where pla_chc_id=#{chc_id}")
    public int delByChcId(@Param("chc_id") int chc_id);

    @Update("<script>update sal_plan <set>" +
            "<if test='pla_date!=null'>pla_date=#{pla_date},</if>" +
            "<if test='pla_todo!=null'>pla_todo=#{pla_todo},</if>" +
            "<if test='pla_result!=null'>pla_result=#{pla_result},</if>" +
            "</set>where pla_id=#{pla_id}</script>")
    public int update(SalPlan plan);

    @Select("SELECT p.`pla_id`,p.`pla_chc_id`,p.`pla_date`,p.`pla_todo`,p.`pla_result` " +
            "FROM sal_plan p WHERE p.`pla_id`=#{id}")
    public SalPlan getById(@Param("id") int id);

    @Select("SELECT p.`pla_id`,p.`pla_chc_id`,p.`pla_date`,p.`pla_todo`,p.`pla_result` " +
            "FROM sal_plan p WHERE p.`pla_chc_id`=#{id} order by p.`pla_date`")
    public List<SalPlan> getByChcId(@Param("id") int chc_id);


}
