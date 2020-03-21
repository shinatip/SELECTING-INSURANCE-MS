package com.sins.termproject.selectinginsurance.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"testno"})
public class Test {

    private Integer testno;

    @JsonProperty("testno")
    @ApiModelProperty(position=0, required = true, dataType="Integer", notes = "Number (5)")
    public Integer getTestno() {
        return testno;
    }

    public void setTestno(Integer testno) {
        this.testno = testno;
    }
}
