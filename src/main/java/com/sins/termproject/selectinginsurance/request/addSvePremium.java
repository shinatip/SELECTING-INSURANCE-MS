package com.sins.termproject.selectinginsurance.request;

import java.math.BigDecimal;

public class addSvePremium {
    protected String precode;
    protected String gender;
    protected Integer min;
    protected Integer max;
    protected BigDecimal price;
    protected Integer subplan;



    public String getPrecode() {
        return precode;
    }

    public void setPrecode(String precode) {
        this.precode = precode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSubplan() {
        return subplan;
    }

    public void setSubplan(Integer subplan) {
        this.subplan = subplan;
    }
}
