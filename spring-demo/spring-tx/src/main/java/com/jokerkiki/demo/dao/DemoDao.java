package com.jokerkiki.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class DemoDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void  insert(){
        String sql = "insert into s_config values (?,?,?)";
        jdbcTemplate.update(sql,UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString());
        int i = 1/0;
        System.out.println("异常啦！！"+ i);
    }

}
