package com.sins.termproject.selectinginsurance.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
* Generated from insuranceSelected.xlsx
* */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"groupCode","groupIns"})
public class InsurancePlan {
    
    
    @NotNull
    protected Integer groupCode;
    
    @Valid 
    protected GroupIns groupIns;

    /**
    * Default constructor
    */
    public InsurancePlan(){}
     

    /**
    * Getter for groupCode 
	* Number 
    */

    @JsonProperty("groupCode")
    @ApiModelProperty(position=0, required = true, dataType="Integer", notes = "Number")
    public Integer getGroupCode(){
        return groupCode;
    } 
    /**
    * Setter for groupCode 
	* Number 
    */
    public void setGroupCode(Integer groupCode){
         this.groupCode=groupCode;
    } 

    /**
    * Getter for groupIns 
	* GroupIns 
    */

    @JsonProperty("groupIns")
    @ApiModelProperty(position=1, required = false, dataType="GroupIns", notes = "GroupIns")
    public GroupIns getGroupIns(){
        return groupIns;
    } 
    /**
    * Setter for groupIns 
	* GroupIns 
    */
    public void setGroupIns(GroupIns groupIns){
         this.groupIns=groupIns;
    }



}