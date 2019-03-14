package com.jokerkiki.demo.service;

import com.jokerkiki.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

            @Autowired(required = false)
    DemoDao demoDao;

    @Override
    public String toString() {
        return "DemoService{" +
                "demoDao=" + demoDao +
                '}';
    }
}
