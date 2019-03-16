package com.shanyu.mapper;

import com.shanyu.pojo.Product;
import com.shanyu.pojo.ProductParam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {

    @Select("<script>SELECT COUNT(p.`pro_id`) FROM product p " +
            "<where> " +
            "<if test='pro_name!=null'>and p.`pro_name` like concat ('%',#{pro_name},'%') </if>" +
            "<if test='pro_type!=null'>and p.`pro_type` like concat ('%',#{pro_type},'%') </if>" +
            "<if test='pro_batch!=null'>and p.`pro_batch` like concat ('%',#{pro_batch},'%')</if></where></script>")
    public int getCount(ProductParam param);

    @Select("<script>SELECT p.`pro_id`,p.`pro_name`,p.`pro_type`,p.`pro_batch`,p.`pro_unit`,p.`pro_price`,p.`pro_memo` FROM product p " +
            "<where> " +
            "<if test='pro_name!=null'>and p.`pro_name` like concat ('%',#{pro_name},'%') </if>" +
            "<if test='pro_type!=null'>and p.`pro_type` like concat ('%',#{pro_type},'%') </if>" +
            "<if test='pro_batch!=null'>and p.`pro_batch` like concat ('%',#{pro_batch},'%')</if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<Product> getList(ProductParam param);
}
