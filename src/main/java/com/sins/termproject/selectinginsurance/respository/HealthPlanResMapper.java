package com.sins.termproject.selectinginsurance.respository;

import com.sins.termproject.selectinginsurance.response.HealthPlanResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HealthPlanResMapper implements RowMapper<HealthPlanResponse> {


    @Override
    public HealthPlanResponse mapRow(ResultSet rs, int i) throws SQLException {
        HealthPlanResponse hel = new HealthPlanResponse();
        hel.setComid(rs.getString(1));
        hel.setCompanyEng(rs.getString(2));
        hel.setCompanyTh(rs.getString(3));
        hel.setCompanyMobile(rs.getString(4));
        hel.setPlanname(rs.getString(5));
        hel.setSubplan(rs.getString(6));
        hel.setIcu(rs.getString(7));
        hel.setRoom(rs.getString(8));
        hel.setOperation(rs.getString(9));
        hel.setAmbulance(rs.getString(10));
        hel.setVisit(rs.getString(11));
        hel.setGender(rs.getString(12));
        hel.setAge(rs.getString(13));
        hel.setPmprice(rs.getString(14));

        return hel;
    }
}
