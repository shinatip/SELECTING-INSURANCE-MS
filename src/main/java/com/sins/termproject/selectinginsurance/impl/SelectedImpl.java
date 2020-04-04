package com.sins.termproject.selectinginsurance.impl;

import com.sins.termproject.selectinginsurance.common.CommonConstant;
import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.request.addSvePremium;
import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import com.sins.termproject.selectinginsurance.response.HealthResBody;
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

//    public ArrayList findCompanysByID(String id){
//        Companys res = insuranceJdbcDao.findByComID(id);
//        ArrayList newArr = new ArrayList<Object>();
//            newArr.add(res);
//       return newArr;
//    }

    public HealthResBody findInsurancePlan(SearchRequest request){
        List<HealthPlanResponse> res = new ArrayList<>();
        String transaction = getDateString()+randomNumber();

        insuranceJdbcDao.insertSearch(transaction, request);
        if(CommonConstant.HEALTH.equals(request.getPlanType())){
             res = (List<HealthPlanResponse>) insuranceJdbcDao.findHealthPlan(request);
        }
        HealthResBody item = new HealthResBody();
        item.setItem(res);

       return item;
    }

    public HealthResBody mappingResponseHealth(HealthPlanResponse res){
        Companys com = new Companys();
                com.setComid(res.getComid());
                com.setCompanyEng(res.getCompanyEng());
        return null;
    }
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
}
