package com.jokerkiki.demo.config;

import com.jokerkiki.demo.entity.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * configuration注解表示通知spring这是一个配置类，类似于原来配置的xml
 */
@Configuration

/**
 * value 扫描指定包路径下的bean实例
 * excludeFilters 指定过滤
 * type 过滤类型 annnatation注解类型
 * class  过滤Controller注解，Service注解
 *
 */
@ComponentScan(value = "com.jokerkiki.demo")
@PropertySource("classpath:test.properties")
public class DemoConfig {


    /**
     * 原来xml中的bean配置，默认方法名即为id，用来代替原来配置的依赖注入
     *
     * @return
     */
    @Bean
    public Person person1(){
        return  new Person();
    }
}
