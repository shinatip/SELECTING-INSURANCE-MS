package com.sins.termproject.selectinginsurance.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
* Generated from insuranceSelected.xlsx
* */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"plantype","planName","planIns"})
public class GroupIns {
    
    
    
    protected String plantype;
    
    
    protected String planName;
    
    @Valid 
    protected PlanIns planIns;

    /**
    * Default constructor
    */
    public GroupIns(){}
     

    /**
    * Getter for plantype 
	* Character 
    */

    @JsonProperty("plantype")
    @ApiModelProperty(position=0, required = false, dataType="String", notes = "Character")
    public String getPlantype(){
        return plantype;
    } 
    /**
    * Setter for plantype 
	* Character 
    */
    public void setPlantype(String plantype){
         this.plantype=plantype;
    } 

    /**
    * Getter for planName 
	* Character 
    */

    @JsonProperty("planName")
    @ApiModelProperty(position=1, required = false, dataType="String", notes = "Character")
    public String getPlanName(){
        return planName;
    } 
    /**
    * Setter for planName 
	* Character 
    */
    public void setPlanName(String planName){
         this.planName=planName;
    } 

    /**
    * Getter for planIns 
	* PlanIns 
    */

    @JsonProperty("planIns")
    @ApiModelProperty(position=2, required = false, dataType="PlanIns", notes = "PlanIns")
    public PlanIns getPlanIns(){
        return planIns;
    } 
    /**
    * Setter for planIns 
	* PlanIns 
    */
    public void setPlanIns(PlanIns planIns){
         this.planIns=planIns;
    }



}