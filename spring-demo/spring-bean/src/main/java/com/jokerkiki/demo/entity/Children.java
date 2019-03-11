package com.jokerkiki.demo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Children implements InitializingBean , DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("child  destroy.............");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("child init............");
    }
}
