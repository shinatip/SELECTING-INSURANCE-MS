package com.sins.termproject.selectinginsurance.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
* Generated from insuranceSelected.xlsx
* */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"comID","comEng","comth","mobile","email","insurancePlan"})
public class Companys {
    
    
    @Digits(integer=5, fraction=0)
    @NotNull
    protected Integer comID;
    
    
    protected String comEng;
    
    
    protected String comth;
    
    
    protected String mobile;
    
    
    protected String email;
    
    @Valid 
    protected List<InsurancePlan> insurancePlan;

    /**
    * Default constructor
    */
    public Companys(){}
     

    /**
    * Getter for comID 
	* Number (5) 
    */

    @JsonProperty("comID")
    @ApiModelProperty(position=0, required = true, dataType="Integer", notes = "Number (5)")
    public Integer getComID(){
        return comID;
    } 
    /**
    * Setter for comID 
	* Number (5) 
    */
    public void setComID(Integer comID){
         this.comID=comID;
    } 

    /**
    * Getter for comEng 
	* Character 
    */

    @JsonProperty("comEng")
    @ApiModelProperty(position=1, required = false, dataType="String", notes = "Character")
    public String getComEng(){
        return comEng;
    } 
    /**
    * Setter for comEng 
	* Character 
    */
    public void setComEng(String comEng){
         this.comEng=comEng;
    } 

    /**
    * Getter for comth 
	* Character 
    */

    @JsonProperty("comth")
    @ApiModelProperty(position=2, required = false, dataType="String", notes = "Character")
    public String getComth(){
        return comth;
    } 
    /**
    * Setter for comth 
	* Character 
    */
    public void setComth(String comth){
         this.comth=comth;
    } 

    /**
    * Getter for mobile 
	* Character 
    */

    @JsonProperty("mobile")
    @ApiModelProperty(position=3, required = false, dataType="String", notes = "Character")
    public String getMobile(){
        return mobile;
    } 
    /**
    * Setter for mobile 
	* Character 
    */
    public void setMobile(String mobile){
         this.mobile=mobile;
    } 

    /**
    * Getter for email 
	* Character 
    */

    @JsonProperty("email")
    @ApiModelProperty(position=4, required = false, dataType="String", notes = "Character")
    public String getEmail(){
        return email;
    } 
    /**
    * Setter for email 
	* Character 
    */
    public void setEmail(String email){
         this.email=email;
    } 

    /**
    * Getter for insurancePlan 
	* List<InsurancePlan> 
    */

    @JsonProperty("insurancePlan")
    @ApiModelProperty(position=5, required = false, dataType="List<InsurancePlan>", notes = "List<InsurancePlan>")
    public List<InsurancePlan> getInsurancePlan(){
        return insurancePlan;
    } 
    /**
    * Setter for insurancePlan 
	* List<InsurancePlan> 
    */
    public void setInsurancePlan(List<InsurancePlan> insurancePlan){
         this.insurancePlan=insurancePlan;
    }



}