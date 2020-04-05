package com.sins.termproject.selectinginsurance.impl;

import com.sins.termproject.selectinginsurance.common.CommonConstant;
import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.request.addSvePremium;
import com.sins.termproject.selectinginsurance.response.*;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import com.sins.termproject.selectinginsurance.respository.InsuranceJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class SelectedImpl {

    @Autowired
    InsuranceJdbcDao insuranceJdbcDao;

    public List<Companys> findCompanys(){
        return insuranceJdbcDao.findAll();
    }


    public Object findInsurancePlan(SearchRequest request){
        String transaction = getDateString()+randomNumber();
        ArrayList<Object> response = new ArrayList<>();

        insuranceJdbcDao.insertSearch(transaction, request);

        if(CommonConstant.HEALTH.equals(request.getPlanType())){
            List<HealthPlanResponse> res = new ArrayList<>();
             res = insuranceJdbcDao.findHealthPlan(request);
            HealthResBody item = new HealthResBody();
            item.setItem(res);
            response.add(item);
        }else if(CommonConstant.SAVING.equals((request.getPlanType()))){
            SavingResBody item = new SavingResBody();
            List<SavingResponse> res = new ArrayList<>();
            res = insuranceJdbcDao.findSavinPlan(request);
            item.setItem(res);
            response.add(item);
        }
       return response;
    }

//    public HealthResBody mappingResponseHealth(HealthPlanResponse res){
//        Companys com = new Companys();
//                com.setComid(res.getComid());
//                com.setCompanyEng(res.getCompanyEng());
//        return null;
//    }
    public String randomNumber(){
        Random ran = new Random();
        int n = ran.nextInt(100);
        return String.format("%04d",n);
    }
    public String getDateString(){
        SimpleDateFormat pattern = new SimpleDateFormat("yyyyMMdd");
        Date d = new Date();
        String str = pattern.format(d);
        return str;
    }

    public void addSvePremium(addSvePremium request) {
        insuranceJdbcDao.insertSvePremium(request);
    }

    public reportResponse getReportOneMouth() {
        reportResponse report = new reportResponse();
        List<reportItem> res = insuranceJdbcDao.callreportOneMouth();
        report.setItem(res);
        return report;
    }
}
