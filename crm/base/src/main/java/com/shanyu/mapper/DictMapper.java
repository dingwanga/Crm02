package com.shanyu.mapper;

import com.shanyu.pojo.Dict;
import com.shanyu.pojo.DictParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DictMapper {

    @Insert("INSERT INTO bas_dict (dict_type,dict_item,dict_value,dict_is_editable) VALUES " +
            "(#{dict_type},#{dict_item},#{dict_value},#{dict_is_editable})")
    public int add(Dict dict);

    @Delete("DELETE FROM bas_dict WHERE dict_id=#{id}")
    public int del(@Param("id") int id);

    @Update("<script>UPDATE bas_dict d <set>" +
            "<if test='dict_type!=null'> d.`dict_type`=#{dict_type}, </if>" +
            "<if test='dict_item!=null'> d.`dict_item`=#{dict_item}, </if>" +
            "<if test='dict_value!=null'> d.`dict_value`=#{dict_value}, </if>" +
            "<if test='dict_is_editable!=null'> d.`dict_is_editable`=#{dict_is_editable} </if>" +
            "</set> where d.`dict_id`=#{dict_id}</script>")
    public int update(Dict dict);

    @Select("select * from bas_dict where dict_id=#{id}")
    public Dict getById(@Param("id") int id);

    @Select("SELECT * FROM bas_dict WHERE dict_type=#{type}")
    public List<Dict> getListByType(String type);

    @Select("<script>SELECT COUNT(1) FROM bas_dict d " +
            "<where>" +
            "<if test='dict_type!=null'> and d.`dict_type` like concat('%',#{dict_type},'%') </if>" +
            "<if test='dict_item!=null'> and d.`dict_item` like concat('%',#{dict_item},'%') </if>" +
            "<if test='dict_value!=null'> and d.`dict_value`=#{dict_value} </if></where></script>")
    public int getCount(DictParam param);

    @Select("<script>SELECT * FROM bas_dict d " +
            "<where>" +
            "<if test='dict_type!=null'> and d.`dict_type` like concat('%',#{dict_type},'%') </if>" +
            "<if test='dict_item!=null'> and d.`dict_item` like concat('%',#{dict_item},'%') </if>" +
            "<if test='dict_value!=null'> and d.`dict_value`=#{dict_value} </if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<Dict> getList(DictParam param);

}
