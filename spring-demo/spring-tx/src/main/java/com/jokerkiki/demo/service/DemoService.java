package com.jokerkiki.demo.service;

import com.jokerkiki.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {

    @Autowired
    DemoDao demoDao;

    @Transactional(rollbackFor = Exception.class)
    public void insert(){
        System.out.println("开始insert");
        demoDao.insert();
        System.out.println("insert完成");

    }
}
