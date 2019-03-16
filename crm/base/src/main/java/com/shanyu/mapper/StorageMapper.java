package com.shanyu.mapper;

import com.shanyu.pojo.Storage;
import com.shanyu.pojo.StorageParam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StorageMapper {

    @Select("<script>SELECT COUNT(1) FROM `storage` s LEFT JOIN product p ON s.`stk_prod_id`=p.`pro_id` " +
            "<where>" +
            "<if test='stk_prod_name!=null'> and CONCAT (p.`pro_name`,' ',p.`pro_type`,' ',p.`pro_batch`) LIKE concat('%',#{stk_prod_name},'%') </if>" +
            "<if test='stk_warehouse!=null'> and s.`stk_warehouse` like concat('%',#{stk_warehouse},'%') </if></where></script>")
    public int getCount(StorageParam param);

    @Select("<script>SELECT s.`stk_id`,s.`stk_ware`,s.`stk_warehouse`,s.`stk_prod_id`,CONCAT (p.`pro_name`,' ',p.`pro_type`,' ',p.`pro_batch`) AS 'stk_prod_name',s.`stk_count`,s.`stk_memo` FROM `storage` s " +
            "LEFT JOIN product p ON s.`stk_prod_id`=p.`pro_id`" +
            "<where>" +
            "<if test='stk_prod_name!=null'> and CONCAT (p.`pro_name`,' ',p.`pro_type`,' ',p.`pro_batch`) LIKE concat('%',#{stk_prod_name},'%') </if>" +
            "<if test='stk_warehouse!=null'> and s.`stk_warehouse` like concat('%',#{stk_warehouse},'%') </if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<Storage> getList(StorageParam param);
}
