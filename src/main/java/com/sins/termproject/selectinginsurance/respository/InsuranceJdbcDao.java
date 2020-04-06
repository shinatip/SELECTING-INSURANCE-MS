package com.sins.termproject.selectinginsurance.respository;

import com.sins.termproject.selectinginsurance.entity.Companys;
import com.sins.termproject.selectinginsurance.request.addSvePremium;
import com.sins.termproject.selectinginsurance.response.CompanyPlanTypeItem;
import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import com.sins.termproject.selectinginsurance.request.SearchRequest;
import com.sins.termproject.selectinginsurance.response.SavingResponse;
import com.sins.termproject.selectinginsurance.response.reportItem;
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
        String sqlstatement ="select c.comid,c.company_eng, c.company_th, c.company_mobile , n.planname , h.subplan,\n" +
                "h.icu, h.room, h.operation, h.ambulance, h.visit, h.baseheal, p.gender, p.age, p.pmprice \n" +
                "from companys c \n" +
                "inner join insuranceplans n\n" +
                "on c.comid = n.comid \n" +
                "inner join subplans s \n" +
                "on s.precode = n.code\n" +
                "inner join healthins h \n" +
                "on h.subplan = s.subplan \n" +
                "inner join premium p\n" +
                "on p.subplan = h.subplan\n" +
                "where n.plantype = 'H'\n" +
                "and p.age = ?\n" +
                "and p.gender = ?\n" +
                "and p.pmprice < ?";
        Object param[] = {req.getAge(), req.getGender(), req.getAfford()};
        List<HealthPlanResponse> helList = (List<HealthPlanResponse>) jdbcTemplate.query( sqlstatement, param,
                new BeanPropertyRowMapper<HealthPlanResponse>(HealthPlanResponse.class));
    return helList;
    }

    public List<SavingResponse> findSavinPlan(SearchRequest req) {
        String sql = "select c.comid,c.company_eng, c.company_th, c.company_mobile , n.planname , v.intrate,\n" +
                "       v.finalint, v.ineach, p.gender, p.age, p.pmprice\n" +
                "       from companys c \n" +
                "       inner join insuranceplans n \n" +
                "       on c.comid = n.comid \n" +
                "       inner join subplans s \n" +
                "       on s.precode = n.code \n" +
                "       inner join savingins v \n" +
                "       on v.plancode = s.plancode \n" +
                "       inner join premium p \n" +
                "       on p.precode = s.precode \n" +
                "       where n.plantype = 'S'" +
                "       and p.age = ? \n" +
                "       and p.gender = ? \n" +
                "       and p.pmprice < ?";
        Object param[] = { req.getAge(), req.getGender(), req.getAfford()};
        List<SavingResponse> savList = (List<SavingResponse>) jdbcTemplate.query( sql, param,
                new BeanPropertyRowMapper<SavingResponse>(SavingResponse.class));
        return savList;
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

    public List<reportItem> callreportOneMouth() {
        String sql = "select count(*)as count, gender, plantype  FROM searchrecs\n" +
                "where search_date between TRUNC(sysdate,'MONTH') and LAST_DAY(sysdate)\n" +
                "group by gender,plantype";
        List<reportItem> res = (List<reportItem>) jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<reportItem>(reportItem.class));
        return res;
    }

    public List<CompanyPlanTypeItem> callreportCompany() {
        String sql = "select c.company_eng ||' '|| \n" +
                "case when p.plantype = 'H' then 'Health Insurance'\n" +
                "    else 'Saving Insurance' end\n" +
                "    as name, \n" +
                "count(p.plantype) as count\n" +
                "from insuranceplans p\n" +
                "inner join companys c\n" +
                "on c.comid = p.comid\n" +
                "group by c.company_eng,p.plantype;";
        List<CompanyPlanTypeItem> res = (List<CompanyPlanTypeItem>) jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<CompanyPlanTypeItem>(CompanyPlanTypeItem.class));
        return res;
    }
}
