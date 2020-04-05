package com.sins.termproject.selectinginsurance.response;

public class reportItem {
    private int count;
    private String gender;
    private String plantype;

    public reportItem() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlantype() {
        return plantype;
    }

    public void setPlantype(String plantype) {
        this.plantype = plantype;
    }

    public reportItem(int count, String gender, String plantype) {
        this.count = count;
        this.gender = gender;
        this.plantype = plantype;
    }

    @Override
    public String toString() {
        return "reportItem{" +
                "count=" + count +
                ", gender='" + gender + '\'' +
                ", plantype='" + plantype + '\'' +
                '}';
    }
}
