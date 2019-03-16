package com.shanyu.pojo;

import java.io.Serializable;

public class Dict implements Serializable {
    private Integer dict_id;
    private String dict_type;
    private String dict_item;
    private Integer dict_value;
    private Integer dict_is_editable;

    public Dict() {
    }

    public Dict(Integer dict_id, String dict_type, String dict_item, Integer dict_value, Integer dict_is_editable) {
        this.dict_id = dict_id;
        this.dict_type = dict_type;
        this.dict_item = dict_item;
        this.dict_value = dict_value;
        this.dict_is_editable = dict_is_editable;
    }

    public Integer getDict_id() {
        return dict_id;
    }

    public void setDict_id(Integer dict_id) {
        this.dict_id = dict_id;
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

    public Integer getDict_is_editable() {
        return dict_is_editable;
    }

    public void setDict_is_editable(Integer dict_is_editable) {
        this.dict_is_editable = dict_is_editable;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "dict_id=" + dict_id +
                ", dict_type='" + dict_type + '\'' +
                ", dict_item='" + dict_item + '\'' +
                ", dict_value=" + dict_value +
                ", dict_is_editable=" + dict_is_editable +
                '}';
    }
}
