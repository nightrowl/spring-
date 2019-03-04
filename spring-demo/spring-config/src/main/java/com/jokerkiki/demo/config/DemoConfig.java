package com.jokerkiki.demo.config;

import com.jokerkiki.demo.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * configuration注解表示通知spring这是一个配置类，类似于原来配置的xml
 */
@Configuration
public class DemoConfig {


    /**
     * 原来xml中的bean配置，默认方法名即为id，用来代替原来配置的依赖注入
     *
     * @return
     */
    @Bean
    public Person person1(){
        return  new Person(1L,"zhangsan");
    }
}
