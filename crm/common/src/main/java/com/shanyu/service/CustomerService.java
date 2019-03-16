package com.shanyu.service;

import com.shanyu.pojo.Customer;
import com.shanyu.pojo.CustomerParam;

public interface CustomerService {

    public int del(String no);

    /**
     * 更新客户信息
     *
     * @param customer - 需要更新的客户信息
     * @return 成功返回1；失败返回0
     */
    public int update(Customer customer);

    /**
     * 根据客户编号查询客户信息
     *
     * @param id - 客户编号
     * @return 查询到的客户对象
     */
    public Customer getById(int id);

    public Customer getByNo(String no);

    /**
     * 设置总页数，列表等信息
     *
     * @param param - 包含各参数和销售机会列表
     */
    public void setParam(CustomerParam param);
}
