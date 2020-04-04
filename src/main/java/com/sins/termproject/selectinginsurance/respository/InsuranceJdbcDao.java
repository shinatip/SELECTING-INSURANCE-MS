package com.sins.termproject.selectinginsurance.respository;

import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.request.addSvePremium;
import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Repository
public class InsuranceJdbcDao {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Companys> findAll(){
        return jdbcTemplate.query("select * from companys",
                new BeanPropertyRowMapper<Companys>(Companys.class));
    }

//    public void insertUserData(SearchRequest req){
//        String sql = "INSERT INTO "
//        jdbcTemplate.update()
//    }

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

    public void insertSearch(String transaction, SearchRequest req) {
        SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = pattern.parse(req.getDob());
            String sql = "insert into SEARCHRECS (transection, gender, age, dob, plantype, maxafford)\n" +
                         "values (?,?,?,?,?,?)";
        Object param[] = {transaction, req.getGender(), req.getAge(), dob, req.getPlanType(), req.getAfford()};
        jdbcTemplate.update(sql, param);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void insertSvePremium(addSvePremium req) {
        int start = req.getMin();
        int end = req.getMax();

        for (int i = start; i <= end ; i++) {
            String sql = "insert into premium \n" +
                    "values ( ?,?,?,?,?)";
            Object param[]= {req.getPrecode(), req.getGender(), i, req.getPrice(), req.getSubplan()};
            jdbcTemplate.update(sql, param);
        }

    }
}
