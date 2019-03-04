package com.jokerkiki.demo.service;

import com.jokerkiki.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    Person person;


}
