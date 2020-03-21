package com.sins.termproject.selectinginsurance.controller;

import com.sins.termproject.selectinginsurance.request.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/test")
public class TestController {



    @Autowired
    TestIml testIml;

    @PostMapping(value = "/add")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void add(
    @Valid  @RequestBody(required = true)
    Test test) throws Exception{

        testIml.saveTest(test);
    }



    @RequestMapping("/hel")
    String get(){
        return "Hello";
    }
}
