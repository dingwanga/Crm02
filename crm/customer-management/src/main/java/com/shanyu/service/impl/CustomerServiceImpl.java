package com.shanyu.service.impl;

import com.shanyu.mapper.CustomerMapper;
import com.shanyu.pojo.Customer;
import com.shanyu.pojo.CustomerParam;
import com.shanyu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int del(String no) {
        Customer cust = customerMapper.getByNo(no);
        cust.setCust_status(2);
        return customerMapper.update(cust);
    }

    @Override
    public int update(Customer customer) {
        return customerMapper.update(customer);
    }

    @Override
    public Customer getById(int id) {
        return customerMapper.getById(id);
    }

    @Override
    public Customer getByNo(String no) {
        return customerMapper.getByNo(no);
    }

    @Override
    public void setParam(CustomerParam param) {
        param.setCount(customerMapper.getCount(param));
        param.setList(customerMapper.getList(param));
    }
}
