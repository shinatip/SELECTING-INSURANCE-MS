package com.sins.termproject.selectinginsurance.response;

public class CompanyPlanTypeItem {
    private String name;
    private Integer count;

    public CompanyPlanTypeItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CompanyPlanTypeItem{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
