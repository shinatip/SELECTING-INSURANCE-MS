package com.sins.termproject.selectinginsurance.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sins.termproject.selectinginsurance.common.CommonConstant;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class InsertInsurance {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();

        try{
            Reader reader1 = new FileReader(CommonConstant.FILE);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
