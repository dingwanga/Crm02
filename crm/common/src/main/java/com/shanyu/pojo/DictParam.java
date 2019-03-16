package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class DictParam extends PageBean {
    private String dict_type;
    private String dict_item;
    private Integer dict_value;
    private List<Dict> list;

    public DictParam() {
    }

    public DictParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
    }

    public String getDict_type() {
        return dict_type;
    }

    public void setDict_type(String dict_type) {
        this.dict_type = dict_type;
    }

    public String getDict_item() {
        return dict_item;
    }

    public void setDict_item(String dict_item) {
        this.dict_item = dict_item;
    }

    public Integer getDict_value() {
        return dict_value;
    }

    public void setDict_value(Integer dict_value) {
        this.dict_value = dict_value;
    }

    public List<Dict> getList() {
        return list;
    }

    public void setList(List<Dict> list) {
        this.list = list;
    }
}
