package com.yh.anniemorden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@EnableTransactionManagement
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/getUser")
    public List<Map<String,Object>> getUser(){
        String sql="select * from user";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        return list;
    }

}
