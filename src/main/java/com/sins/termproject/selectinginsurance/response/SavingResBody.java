package com.sins.termproject.selectinginsurance.response;

import java.util.List;

public class SavingResBody {
    private List<SavingResponse> item;

    public SavingResBody() {
    }

    public List<SavingResponse> getItem() {
        return item;
    }

    public void setItem(List<SavingResponse> item) {
        this.item = item;
    }
}
