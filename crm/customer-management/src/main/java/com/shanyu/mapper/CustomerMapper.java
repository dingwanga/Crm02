package com.shanyu.mapper;

import com.shanyu.pojo.Customer;
import com.shanyu.pojo.CustomerParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CustomerMapper {

    @Update("<script>UPDATE cst_customer c <set>" +
            "<if test='cust_name!=null'>c.`cust_name`=#{cust_name}, </if>" +
            "<if test='cust_region>0'>c.`cust_region`=#{cust_region}, </if>" +
            "<if test='cust_manager_id>0'>c.`cust_manager_id`=#{cust_manager_id}, </if>" +
            "<if test='cust_level>0'>c.`cust_level`=#{cust_level}, </if>" +
            "<if test='cust_satisfy>0'>c.`cust_satisfy`=#{cust_satisfy}, </if>" +
            "<if test='cust_credit>0'>c.`cust_credit`=#{cust_credit}, </if>" +
            "<if test='cust_addr!=null'>c.`cust_addr`=#{cust_addr}, </if>" +
            "<if test='cust_zip!=null'>c.`cust_zip`=#{cust_zip}, </if>" +
            "<if test='cust_tel!=null'>c.`cust_tel`=#{cust_tel}, </if>" +
            "<if test='cust_fax!=null'>c.`cust_fax`=#{cust_fax}, </if>" +
            "<if test='cust_web!=null'>c.`cust_web`=#{cust_web}, </if>" +
            "<if test='cust_licence!=null'>c.`cust_licence`=#{cust_licence}, </if>" +
            "<if test='cust_chieftain!=null'>c.`cust_chieftain`=#{cust_chieftain}, </if>" +
            "<if test='cust_bankroll!=null'>c.`cust_bankroll`=#{cust_bankroll}, </if>" +
            "<if test='cust_turnover!=null'>c.`cust_turnover`=#{cust_turnover}, </if>" +
            "<if test='cust_bank!=null'>c.`cust_bank`=#{cust_bank}, </if>" +
            "<if test='cust_account!=null'>c.`cust_account`=#{cust_account}, </if>" +
            "<if test='cust_local_tax!=null'>c.`cust_local_tax`=#{cust_local_tax}, </if>" +
            "<if test='cust_national_tax!=null'>c.`cust_national_tax`=#{cust_national_tax}, </if>" +
            "<if test='cust_status!=null'>c.`cust_status`=#{cust_status}</if> " +
            "</set> WHERE c.`cust_no`=#{cust_no}</script>")
    public int update(Customer customer);

    @Select("SELECT c.`cust_id`,c.`cust_no`,c.`cust_name`,c.`cust_region`,d1.`dict_item` AS 'cust_region_name',c.`cust_manager_id`,u.`usr_name` AS 'cust_manager_name',c.`cust_level`,d2.`dict_item` AS 'cust_level_name',c.`cust_satisfy`,c.`cust_credit`,c.`cust_addr`,c.`cust_zip`,c.`cust_tel`,c.`cust_fax`,c.`cust_web`,c.`cust_licence`,c.`cust_chieftain`,c.`cust_bankroll`,c.`cust_turnover`,c.`cust_bank`,c.`cust_account`,c.`cust_local_tax`,c.`cust_national_tax`,c.`cust_status` FROM cst_customer c " +
            "LEFT JOIN bas_dict d1 ON c.`cust_region`=d1.`dict_value` AND d1.`dict_type`='地区' " +
            "LEFT JOIN bas_dict d2 ON c.`cust_level`=d2.`dict_value` AND d2.`dict_type`='企业客户等级' " +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id` where c.`cust_id`=#{id}")
    public Customer getById(@Param("id") int id);

    @Select("SELECT c.`cust_id`,c.`cust_no`,c.`cust_name`,c.`cust_region`,d1.`dict_item` AS 'cust_region_name',c.`cust_manager_id`,u.`usr_name` AS 'cust_manager_name',c.`cust_level`,d2.`dict_item` AS 'cust_level_name',c.`cust_satisfy`,c.`cust_credit`,c.`cust_addr`,c.`cust_zip`,c.`cust_tel`,c.`cust_fax`,c.`cust_web`,c.`cust_licence`,c.`cust_chieftain`,c.`cust_bankroll`,c.`cust_turnover`,c.`cust_bank`,c.`cust_account`,c.`cust_local_tax`,c.`cust_national_tax`,c.`cust_status` FROM cst_customer c " +
            "LEFT JOIN bas_dict d1 ON c.`cust_region`=d1.`dict_value` AND d1.`dict_type`='地区' " +
            "LEFT JOIN bas_dict d2 ON c.`cust_level`=d2.`dict_value` AND d2.`dict_type`='企业客户等级' " +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id` where c.`cust_no`=#{no}")
    public Customer getByNo(@Param("no") String no);

    @Select("<script>SELECT COUNT(c.`cust_id`) FROM cst_customer c " +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id` " +
            "<where> c.`cust_status`=1 " +
            "<if test='cust_no!=null'>and c.`cust_no` LIKE CONCAT('%',#{cust_no},'%') </if>" +
            "<if test='cust_name!=null'>and c.`cust_name` LIKE CONCAT('%',#{cust_name},'%') </if>" +
            "<if test='cust_region!=0'>and c.`cust_region`=#{cust_region} </if>" +
            "<if test='cust_manager_name!=null'>and u.`usr_name` LIKE CONCAT('%',#{cust_manager_name},'%') </if>" +
            "<if test='cust_level!=0'>and c.`cust_level`=#{cust_level} </if>" +
            "</where></script>")
    public int getCount(CustomerParam param);

    @Select("<script>SELECT c.`cust_id`,c.`cust_no`,c.`cust_name`,c.`cust_region`,d1.`dict_item` AS 'cust_region_name',c.`cust_manager_id`,u.`usr_name` AS 'cust_manager_name',c.`cust_level`,d2.`dict_item` AS 'cust_level_name',c.`cust_satisfy`,c.`cust_credit`,c.`cust_addr`,c.`cust_zip`,c.`cust_tel`,c.`cust_fax`,c.`cust_web`,c.`cust_licence`,c.`cust_chieftain`,c.`cust_bankroll`,c.`cust_turnover`,c.`cust_bank`,c.`cust_account`,c.`cust_local_tax`,c.`cust_national_tax`,c.`cust_status` FROM cst_customer c " +
            "LEFT JOIN bas_dict d1 ON c.`cust_region`=d1.`dict_value` AND d1.`dict_type`='地区' " +
            "LEFT JOIN bas_dict d2 ON c.`cust_level`=d2.`dict_value` AND d2.`dict_type`='企业客户等级' " +
            "LEFT JOIN sys_user u ON c.`cust_manager_id`=u.`usr_id` " +
            "<where> c.`cust_status`=1 " +
            "<if test='cust_no!=null'>and c.`cust_no` LIKE CONCAT('%',#{cust_no},'%') </if>" +
            "<if test='cust_name!=null'>and c.`cust_name` LIKE CONCAT('%',#{cust_name},'%') </if>" +
            "<if test='cust_region!=0'>and c.`cust_region`=#{cust_region} </if>" +
            "<if test='cust_manager_name!=null'>and u.`usr_name` LIKE CONCAT('%',#{cust_manager_name},'%') </if>" +
            "<if test='cust_level!=0'>and c.`cust_level`=#{cust_level}</if>" +
            "</where> limit #{from},#{pageSize}</script>")
    public List<Customer> getList(CustomerParam param);
}
