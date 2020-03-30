package com.sins.termproject.selectinginsurance.request;

import javax.validation.constraints.Size;


public class SearchRequest {
    
    
    @Size(max=10)
    protected String gender;

    protected Integer age;
    
    protected String planType;

    protected String afford;

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

    public String getAfford(){
        return afford;
    }
    /**
     * Setter for typeIns
     * Character
     */
    public void setAfford(String afford){
        this.afford = afford;
    }

}