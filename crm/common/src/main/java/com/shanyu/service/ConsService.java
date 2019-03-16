package com.shanyu.service;

import com.shanyu.pojo.Cons;

import java.util.List;

public interface ConsService {

    public List<Cons> getByType(int type);
}
