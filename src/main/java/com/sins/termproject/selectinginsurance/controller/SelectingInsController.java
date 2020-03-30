package com.sins.termproject.selectinginsurance.controller;

import com.sins.termproject.selectinginsurance.impl.SelectedImpl;
import com.sins.termproject.selectinginsurance.impl.TestImpl;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import com.sins.termproject.selectinginsurance.response.HealthResBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping( value = "/select/insurance")
public class SelectingInsController {

    @Autowired
    TestImpl testimpl;
    @Autowired
    SelectedImpl selectedImpl;

    @PostMapping(value = "/find")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public HealthResBody findInsurance(
            @Valid @RequestBody (required = true) SearchRequest request){

             return selectedImpl.findInsurancePlan(request);
//            return ResponseEntity.status(HttpStatus.OK).build();
//        return testimpl.findTest(request.getAfford()).getTestno();
        }



}
