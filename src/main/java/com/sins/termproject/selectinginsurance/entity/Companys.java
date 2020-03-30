package com.sins.termproject.selectinginsurance.entity;

import javax.persistence.Entity;


public class Companys {

  private String comid;
  private String companyEng;
  private String companyTh;
  private String companyMobile;
  private String companyEmail;

  public Companys() {
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


  public String getCompanyEmail() {
    return companyEmail;
  }

  public void setCompanyEmail(String companyEmail) {
    this.companyEmail = companyEmail;
  }

  public Companys(String comid, String companyEng, String companyTh, String companyMobile, String companyEmail) {
    this.comid = comid;
    this.companyEng = companyEng;
    this.companyTh = companyTh;
    this.companyMobile = companyMobile;
    this.companyEmail = companyEmail;
  }

  @Override
  public String toString() {
    return "Companys{" +
            "comid='" + comid + '\'' +
            ", companyEng='" + companyEng + '\'' +
            ", companyTh='" + companyTh + '\'' +
            ", companyMobile='" + companyMobile + '\'' +
            ", companyEmail='" + companyEmail + '\'' +
            '}';
  }
}
