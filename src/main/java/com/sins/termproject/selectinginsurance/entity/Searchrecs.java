package com.sins.termproject.selectinginsurance.entity;


import java.util.Date;

public class Searchrecs {

  private String transection;
  private String gender;
  private String age;
  private Date dob;
  private Date searchDate;
  private String plantype;


  public String getTransection() {
    return transection;
  }

  public void setTransection(String transection) {
    this.transection = transection;
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


  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }


  public Date getSearchDate() {
    return searchDate;
  }

  public void setSearchDate(Date searchDate) {
    this.searchDate = searchDate;
  }


  public String getPlantype() {
    return plantype;
  }

  public void setPlantype(String plantype) {
    this.plantype = plantype;
  }

}
