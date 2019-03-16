package cn.bdqn.crm.util;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        //return UUID.randomUUID().toString().replace("-", "").toLowerCase();
        //System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID().toString().replace("-", "").toUpperCase());
    }
}
