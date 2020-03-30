package com.sins.termproject.selectinginsurance.response;

public class HealthPlanResponse {

    private String comid;
    private String companyEng;
    private String companyTh;
    private String companyMobile;
    private String planname;
    private String subplan;
    private String icu;
    private String room;
    private String operation;
    private String ambulance;
    private String visit;
    private String baseheal;
    private String gender;
    private String age;
    private String pmprice;

    public HealthPlanResponse() {
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid;
    }

    public String getCompanyEng() {
        return companyEng;
    }

    public void setCompanyEng(String companyEng) {
        this.companyEng = companyEng;
    }

    public String getCompanyTh() {
        return companyTh;
    }

    public void setCompanyTh(String companyTh) {
        this.companyTh = companyTh;
    }

    public String getCompanyMobile() {
        return companyMobile;
    }

    public void setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname;
    }

    public String getSubplan() {
        return subplan;
    }

    public void setSubplan(String subplan) {
        this.subplan = subplan;
    }

    public String getIcu() {
        return icu;
    }

    public void setIcu(String icu) {
        this.icu = icu;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(String ambulance) {
        this.ambulance = ambulance;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }

    public String getBaseheal() {
        return baseheal;
    }

    public void setBaseheal(String baseheal) {
        this.baseheal = baseheal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPmprice() {
        return pmprice;
    }

    public void setPmprice(String pmprice) {
        this.pmprice = pmprice;
    }

    public HealthPlanResponse(String comid, String companyEng, String companyTh, String companyMobile, String planname, String subplan, String icu, String room, String operation, String ambulance, String visit, String baseheal, String gender, String age, String pmprice) {
        this.comid = comid;
        this.companyEng = companyEng;
        this.companyTh = companyTh;
        this.companyMobile = companyMobile;
        this.planname = planname;
        this.subplan = subplan;
        this.icu = icu;
        this.room = room;
        this.operation = operation;
        this.ambulance = ambulance;
        this.visit = visit;
        this.baseheal = baseheal;
        this.gender = gender;
        this.age = age;
        this.pmprice = pmprice;
    }

    @Override
    public String toString() {
        return "HealthPlanResponse{" +
                "comid='" + comid + '\'' +
                ", companyEng='" + companyEng + '\'' +
                ", companyTh='" + companyTh + '\'' +
                ", companyMobile='" + companyMobile + '\'' +
                ", planname='" + planname + '\'' +
                ", subplan='" + subplan + '\'' +
                ", icu='" + icu + '\'' +
                ", room='" + room + '\'' +
                ", operation='" + operation + '\'' +
                ", ambulance='" + ambulance + '\'' +
                ", visit='" + visit + '\'' +
                ", baseheal='" + baseheal + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", pmprice='" + pmprice + '\'' +
                '}';
    }

}
