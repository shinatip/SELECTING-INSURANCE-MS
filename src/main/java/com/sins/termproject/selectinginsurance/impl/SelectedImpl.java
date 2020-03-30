package com.sins.termproject.selectinginsurance.impl;

import com.sins.termproject.selectinginsurance.common.CommonConstant;
import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import com.sins.termproject.selectinginsurance.response.HealthResBody;
import com.sins.termproject.selectinginsurance.respository.InsuranceJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SelectedImpl {

    @Autowired
    InsuranceJdbcDao insuranceJdbcDao;

    public List<Companys> findCompanys(){
        return insuranceJdbcDao.findAll();
    }

    public ArrayList findCompanysByID(String id){
        Companys res = insuranceJdbcDao.findByComID(id);
        ArrayList newArr = new ArrayList<Object>();
            newArr.add(res);
       return newArr;
    }

    public HealthResBody findInsurancePlan(SearchRequest request){
        List<HealthPlanResponse> res = new ArrayList<>();
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
}
