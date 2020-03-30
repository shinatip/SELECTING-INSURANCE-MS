package com.sins.termproject.selectinginsurance.response;

import java.util.List;

public class HealthResBody {

    private List<HealthPlanResponse> item;

    public HealthResBody() {
    }

    public List<HealthPlanResponse> getItem() {
        return item;
    }

    public void setItem(List<HealthPlanResponse> item) {
        this.item = item;
    }
}
