package com.jokerkiki.demo.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Boy {

    public Boy(){
        System.out.println("boy create.................");
    }

    @PostConstruct
    public void init(){
        System.out.println("boy init..................");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("boy destroy................");
    }
}
