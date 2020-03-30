package com.sins.termproject.selectinginsurance.response;

import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.entity.Healthins;
import com.sins.termproject.selectinginsurance.entity.Insuranceplans;
import com.sins.termproject.selectinginsurance.entity.Premium;

public class HealthResItem {
    private Companys companys;
    private Healthins healthins;
    private Insuranceplans insuranceplans;
    private Premium premium;

    public HealthResItem() {
    }

    public Companys getCompanys() {
        return companys;
    }

    public void setCompanys(Companys companys) {
        this.companys = companys;
    }

    public Healthins getHealthins() {
        return healthins;
    }

    public void setHealthins(Healthins healthins) {
        this.healthins = healthins;
    }

    public Insuranceplans getInsuranceplans() {
        return insuranceplans;
    }

    public void setInsuranceplans(Insuranceplans insuranceplans) {
        this.insuranceplans = insuranceplans;
    }

    public Premium getPremium() {
        return premium;
    }

    public void setPremium(Premium premium) {
        this.premium = premium;
    }
}
