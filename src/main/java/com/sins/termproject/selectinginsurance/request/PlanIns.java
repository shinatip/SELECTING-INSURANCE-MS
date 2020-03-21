package com.sins.termproject.selectinginsurance.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
* Generated from insuranceSelected.xlsx
* */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"code","icu","room","operation","ambulance","visit","maxAge","timeLength","intRate","finalInt","ineach"})
public class PlanIns {
    
    
    @NotBlank
    @Size(min=1)
    protected String code;
    
    protected BigDecimal icu;
    
    protected BigDecimal room;
    
    protected BigDecimal operation;
    
    protected BigDecimal ambulance;
    
    protected BigDecimal visit;
    
    protected Integer maxAge;
    
    protected Integer timeLength;
    
    protected BigDecimal intRate;
    
    protected BigDecimal finalInt;
    
    protected BigDecimal ineach;

    /**
    * Default constructor
    */
    public PlanIns(){}
     

    /**
    * Getter for code 
	* Character 
    */

    @JsonProperty("code")
    @ApiModelProperty(position=0, required = true, dataType="String", notes = "Character")
    public String getCode(){
        return code;
    } 
    /**
    * Setter for code 
	* Character 
    */
    public void setCode(String code){
         this.code=code;
    } 

    /**
    * Getter for icu 
	* Number 
    */

    @JsonProperty("icu")
    @ApiModelProperty(position=1, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getIcu(){
        return icu;
    } 
    /**
    * Setter for icu 
	* Number 
    */
    public void setIcu(BigDecimal icu){
         this.icu=icu;
    } 

    /**
    * Getter for room 
	* Number 
    */

    @JsonProperty("room")
    @ApiModelProperty(position=2, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getRoom(){
        return room;
    } 
    /**
    * Setter for room 
	* Number 
    */
    public void setRoom(BigDecimal room){
         this.room=room;
    } 

    /**
    * Getter for operation 
	* Number 
    */

    @JsonProperty("operation")
    @ApiModelProperty(position=3, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getOperation(){
        return operation;
    } 
    /**
    * Setter for operation 
	* Number 
    */
    public void setOperation(BigDecimal operation){
         this.operation=operation;
    } 

    /**
    * Getter for ambulance 
	* Number 
    */

    @JsonProperty("ambulance")
    @ApiModelProperty(position=4, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getAmbulance(){
        return ambulance;
    } 
    /**
    * Setter for ambulance 
	* Number 
    */
    public void setAmbulance(BigDecimal ambulance){
         this.ambulance=ambulance;
    } 

    /**
    * Getter for visit 
	* Number 
    */

    @JsonProperty("visit")
    @ApiModelProperty(position=5, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getVisit(){
        return visit;
    } 
    /**
    * Setter for visit 
	* Number 
    */
    public void setVisit(BigDecimal visit){
         this.visit=visit;
    } 

    /**
    * Getter for maxAge 
	* Number 
    */

    @JsonProperty("maxAge")
    @ApiModelProperty(position=6, required = false, dataType="Integer", notes = "Number")
    public Integer getMaxAge(){
        return maxAge;
    } 
    /**
    * Setter for maxAge 
	* Number 
    */
    public void setMaxAge(Integer maxAge){
         this.maxAge=maxAge;
    } 

    /**
    * Getter for timeLength 
	* Number 
    */

    @JsonProperty("timeLength")
    @ApiModelProperty(position=7, required = false, dataType="Integer", notes = "Number")
    public Integer getTimeLength(){
        return timeLength;
    } 
    /**
    * Setter for timeLength 
	* Number 
    */
    public void setTimeLength(Integer timeLength){
         this.timeLength=timeLength;
    } 

    /**
    * Getter for intRate 
	* Number 
    */

    @JsonProperty("intRate")
    @ApiModelProperty(position=8, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getIntRate(){
        return intRate;
    } 
    /**
    * Setter for intRate 
	* Number 
    */
    public void setIntRate(BigDecimal intRate){
         this.intRate=intRate;
    } 

    /**
    * Getter for finalInt 
	* Number 
    */

    @JsonProperty("finalInt")
    @ApiModelProperty(position=9, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getFinalInt(){
        return finalInt;
    } 
    /**
    * Setter for finalInt 
	* Number 
    */
    public void setFinalInt(BigDecimal finalInt){
         this.finalInt=finalInt;
    } 

    /**
    * Getter for ineach 
	* Number 
    */

    @JsonProperty("ineach")
    @ApiModelProperty(position=10, required = false, dataType="BigDecimal", notes = "Number")
    public BigDecimal getIneach(){
        return ineach;
    } 
    /**
    * Setter for ineach 
	* Number 
    */
    public void setIneach(BigDecimal ineach){
         this.ineach=ineach;
    }



}