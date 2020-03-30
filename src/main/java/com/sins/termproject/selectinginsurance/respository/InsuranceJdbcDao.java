package com.sins.termproject.selectinginsurance.respository;

import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public class InsuranceJdbcDao {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Companys> findAll(){
        return jdbcTemplate.query("select * from companys",
                new BeanPropertyRowMapper<Companys>(Companys.class));
    }

    public Companys findByComID(String id){
        return  jdbcTemplate.queryForObject("select * from companys where COMID = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<Companys>(Companys.class));
    }

    public Companys findChoiceInsuran(String id){
        return  jdbcTemplate.queryForObject("select * from companys where COMID = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<Companys>(Companys.class));
    }

    public List<HealthPlanResponse> findHealthPlan(SearchRequest req) {
        String sqlstatement = "select c.comid,c.company_eng, c.company_th, c.company_mobile , n.planname , h.subplan, h.icu, h.room, h.operation, \n" +
                "       h.ambulance, h.visit, h.baseheal, p.gender, p.age, p.pmprice \n" +
                "    from companys c \n" +
                "    inner join insuranceplans n \n" +
                "    on c.comid = n.comid \n" +
                "    inner join subplans s \n" +
                "    on s.plancode = n.plancode \n" +
                "    inner join healthins h \n" +
                "    on h.subplan = s.subplan \n" +
                "    inner join premium p \n" +
                "    on p.subplan = h.subplan \n" +
                "where p.age = ? \n" +
                "and p.gender = ? \n" +
                "and p.pmprice < ? \n";
        Object param[] = {req.getAge(), req.getGender(), req.getAfford()};
        List<HealthPlanResponse> helList = (List<HealthPlanResponse>) jdbcTemplate.query( sqlstatement, param,
                new BeanPropertyRowMapper<HealthPlanResponse>(HealthPlanResponse.class));

    return helList;
    }
}
