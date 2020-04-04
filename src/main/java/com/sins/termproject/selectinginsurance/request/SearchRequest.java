package com.sins.termproject.selectinginsurance.request;


import java.math.BigDecimal;

public class SearchRequest {



    protected String gender;

    protected String dob;

    protected Integer age;
    
    protected String planType;

    protected BigDecimal afford;

    /**
    * Default constructor
    */
    public SearchRequest(){}
     

    /**
    * Getter for gender 
	* Character (10) 
    */

    public String getGender(){
        return gender;
    } 
    /**
    * Setter for gender 
	* Character (10) 
    */
    public void setGender(String gender){
         this.gender=gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getAge(){
        return age;
    } 
    /**
    * Setter for dateOfBirth 
	* Intefer
    */
    public void setAge(Integer age){
         this.age = age;
    } 

    /**
    * Getter for typeIns 
	* Character 
    */

    public String getPlanType(){
        return planType;
    } 
    /**
    * Setter for typeIns 
	* Character 
    */
    public void setPlanType(String planType){
         this.planType = planType;
    }

    public BigDecimal getAfford(){
        return afford;
    }
    /**
     * Setter for typeIns
     * Character
     */
    public void setAfford(BigDecimal afford){
        this.afford = afford;
    }

}