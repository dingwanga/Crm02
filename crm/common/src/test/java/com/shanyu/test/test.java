package com.shanyu.test;

import com.shanyu.pojo.CustomerParam;

public class test {
    public static void main(String[] args) {
        CustomerParam param = new CustomerParam(5,10);
        param.setCount(49);
        System.out.println(param.getFrom());
    }
}
