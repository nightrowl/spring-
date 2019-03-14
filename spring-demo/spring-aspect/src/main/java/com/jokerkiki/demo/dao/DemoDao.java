package com.jokerkiki.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {


    public int demo(int i )throws Exception{
        if(i == 0 ){
            throw new Exception("返回异常");
        }

        return  i;
    }

}
