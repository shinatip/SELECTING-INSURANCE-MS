package com.sins.termproject.selectinginsurance.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.Date;

/**
* Generated from insuranceSelected.xlsx
* */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"gender","dateOfBirth","typeIns"})
public class SearchRequest {
    
    
    @Size(max=10)
    protected String gender;
    

    protected Date dateOfBirth;
    
    
    protected String typeIns;

    /**
    * Default constructor
    */
    public SearchRequest(){}
     

    /**
    * Getter for gender 
	* Character (10) 
    */

    @JsonProperty("gender")
    @ApiModelProperty(position=0, required = false, dataType="String", notes = "Character (10)")
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

    /**
    * Getter for dateOfBirth 
	* Date (YYYY-MM-DD) (10) 
    */

    @JsonProperty("dateOfBirth")
    @ApiModelProperty(position=1, required = false, dataType="String", notes = "Date (YYYY-MM-DD) (10)")
    public Date getDateOfBirth(){
        return dateOfBirth;
    } 
    /**
    * Setter for dateOfBirth 
	* Date (YYYY-MM-DD) (10) 
    */
    public void setDateOfBirth(Date dateOfBirth){
         this.dateOfBirth=dateOfBirth;
    } 

    /**
    * Getter for typeIns 
	* Character 
    */

    @JsonProperty("typeIns")
    @ApiModelProperty(position=2, required = false, dataType="String", notes = "Character")
    public String getTypeIns(){
        return typeIns;
    } 
    /**
    * Setter for typeIns 
	* Character 
    */
    public void setTypeIns(String typeIns){
         this.typeIns=typeIns;
    }



}