package com.sins.termproject.selectinginsurance.controller;

import com.sins.termproject.selectinginsurance.request.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestIml implements  TestDAO {

   private JdbcTemplate jdbcTemplate;

    @Override
    public void saveTest(Test test) {

        String sql = "insert int test value (?)";

        jdbcTemplate.update(sql, new Object[]
                {test.getTestno()});

    }
}
