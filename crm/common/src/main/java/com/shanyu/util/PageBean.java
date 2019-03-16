package com.shanyu.util;

public class PageBean {
    private int pageNo = 1;
    private int pageSize = 5;
    private int count;
    private int pageCount;
    private int from;

    public PageBean() {
    }

    public PageBean(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        this.pageCount = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
        if (pageNo > pageCount) {
            pageNo = pageCount;
        }
        if (pageNo < 1) {
            pageNo = 1;
        }
        from = (pageNo - 1) * pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }


}
