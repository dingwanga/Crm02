package com.shanyu.mapper;

import com.shanyu.pojo.OrderLine;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderLineMapper {

    @Select("SELECT l.`odl_id`,l.`odl_odr_id`,l.`odl_pro_id`,p.`pro_name` as 'odl_pro_name',l.`odl_count`,p.`pro_unit` as 'odl_pro_unit',p.`pro_price` as 'odl_pro_price',l.`odl_price` FROM odr_line l " +
            "LEFT JOIN product p ON l.`odl_pro_id`=p.`pro_id` " +
            "WHERE l.`odl_odr_id`=#{odr_id}")
    public List<OrderLine> getListByOdrId(@Param("odr_id") int odr_id);


}
