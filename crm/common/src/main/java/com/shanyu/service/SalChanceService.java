package com.shanyu.service;

import com.shanyu.pojo.SalChance;
import com.shanyu.pojo.SalChanceParam;

public interface SalChanceService {

    /**
     * 添加销售机会
     *
     * @param chance - 需要添加的销售机会对象
     * @return 成功返回1，失败返回0
     */
    public int add(SalChance chance);

    /**
     * 删除销售机会
     *
     * @param id - 需要删除的销售机会编号
     * @return 成功返回1，失败返回0
     */
    public int del(int id);

    /**
     * 更新销售机会
     *
     * @param chance - 需要更新的销售机会对象
     * @return 成功返回1，失败返回0
     */
    public int update(SalChance chance);

    /**
     * 根据销售机会编号获取销售机会
     *
     * @param id - 销售机会编号
     * @return 获取到的销售机会对象
     */
    public SalChance getById(int id);

    /**
     * 设置总页数，列表等信息
     *
     * @param param - 包含各参数和销售机会列表
     */
    public void setParam(SalChanceParam param);

    /**
     * 终止开发销售机会
     *
     * @param id - 需要终止的销售机会编号
     * @return 成功返回1，失败返回0
     */
    public int stopSalChance(int id);
}
