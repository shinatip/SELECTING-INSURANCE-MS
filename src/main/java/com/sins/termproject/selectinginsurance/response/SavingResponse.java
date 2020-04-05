package com.sins.termproject.selectinginsurance.response;

public class SavingResponse {
    private String comid;
    private String companyEng;
    private String companyTh;
    private String companyMobile;
    private String planname;
    private String intrate;
    private String finalint;
    private String ineach;
    private String gender;
    private String age;
    private String pmprice;

    public SavingResponse() {
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

    public String getIntrate() {
        return intrate;
    }

    public void setIntrate(String intrate) {
        this.intrate = intrate;
    }

    public String getFinalint() {
        return finalint;
    }

    public void setFinalint(String finalint) {
        this.finalint = finalint;
    }

    public String getIneach() {
        return ineach;
    }

    public void setIneach(String ineach) {
        this.ineach = ineach;
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

    public SavingResponse(String comid, String companyEng, String companyTh, String companyMobile, String planname, String intrate, String finalint, String ineach, String gender, String age, String pmprice) {
        this.comid = comid;
        this.companyEng = companyEng;
        this.companyTh = companyTh;
        this.companyMobile = companyMobile;
        this.planname = planname;
        this.intrate = intrate;
        this.finalint = finalint;
        this.ineach = ineach;
        this.gender = gender;
        this.age = age;
        this.pmprice = pmprice;
    }

    @Override
    public String toString() {
        return "SavingResponse{" +
                "comid='" + comid + '\'' +
                ", companyEng='" + companyEng + '\'' +
                ", companyTh='" + companyTh + '\'' +
                ", companyMobile='" + companyMobile + '\'' +
                ", planname='" + planname + '\'' +
                ", intrate=" + intrate +
                ", finalint=" + finalint +
                ", ineach=" + ineach +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", pmprice=" + pmprice +
                '}';
    }
}
