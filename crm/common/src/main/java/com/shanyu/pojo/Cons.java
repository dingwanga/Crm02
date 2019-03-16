package com.shanyu.pojo;

import java.io.Serializable;

public class Cons implements Serializable {
    private Integer level;
    private String item;
    private Integer count;

    public Cons() {
    }

    public Cons(Integer level, String item, Integer count) {
        this.level = level;
        this.item = item;
        this.count = count;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Cons{" +
                "level=" + level +
                ", item='" + item + '\'' +
                ", count=" + count +
                '}';
    }
}
