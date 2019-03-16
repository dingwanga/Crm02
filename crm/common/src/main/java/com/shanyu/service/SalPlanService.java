package com.shanyu.service;

import com.shanyu.pojo.SalPlan;
import com.shanyu.pojo.SalPlanParam;

public interface SalPlanService {

    /**
     * 添加计划
     *
     * @param plan - 需要添加的计划
     * @return 成功返回1，失败返回0
     */
    public int add(SalPlan plan);

    /**
     * 根据编号删除计划
     *
     * @param id - 需要删除的计划编号
     * @return 成功返回1，失败返回0
     */
    public int del(int id);

    /**
     * 修改计划
     *
     * @param plan - 需要修改的计划对象
     * @return 成功返回1，失败返回0
     */
    public int update(SalPlan plan);

    /**
     * 根据销售机会编号获取销售机会和销售计划
     *
     * @param chc_id - 销售机会编号
     * @return 销售机会和相关销售计划
     */
    public SalPlanParam getSalPlanParamByChcId(int chc_id);

}
