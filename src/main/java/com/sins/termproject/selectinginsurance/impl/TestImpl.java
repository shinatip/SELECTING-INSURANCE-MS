package com.sins.termproject.selectinginsurance.impl;

import com.sins.termproject.selectinginsurance.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class TestImpl {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public Test findTest(String afford){



        String sql = "select * from test where TEST.TESTNO = ?";


     RowMapper<Test> map = new RowMapper<Test>() {
         @Override
         public Test mapRow(ResultSet rs, int i) throws SQLException {
             Test ts = new Test();
             ts.setTestno(rs.getInt("testno"));
             System.out.println(ts);
             return ts;
         }
     };

return jdbcTemplate.queryForObject(sql, new Object[] {afford}, map);
    }
}
