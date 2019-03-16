package com.shanyu.pojo;

import java.util.List;

public class SalPlanParam {
    private SalChance chance;
    private List<SalPlan> plans;

    public SalPlanParam() {
    }

    public SalPlanParam(SalChance chance, List<SalPlan> plans) {
        this.chance = chance;
        this.plans = plans;
    }

    public SalChance getChance() {
        return chance;
    }

    public void setChance(SalChance chance) {
        this.chance = chance;
    }

    public List<SalPlan> getPlans() {
        return plans;
    }

    public void setPlans(List<SalPlan> plans) {
        this.plans = plans;
    }
}
