package com.jokerkiki.demo.config;

import com.jokerkiki.demo.entity.Person;
import com.jokerkiki.demo.factory.DemoFactory;
import com.jokerkiki.demo.imports.DemoImport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * configuration注解表示通知spring这是一个配置类，类似于原来配置的xml
 */
@Configuration
@Import(DemoImport.class)
public class DemoConfig {


    /**
     * scope默认是单实例，可以修改
     * prototype 多实例
     * singleton 单例
     * 应用于web :
     * request 同一次请求创建一个实例
     * session 同一个session中创建一个实例
     *
     * @return
     */
    @Scope("prototype")
    /**
     * 原来xml中的bean配置，默认方法名即为id，用来代替原来配置的依赖注入
     *
     * @return
     */
    @Bean
    public Person person1(){
        return  new Person(1L,"zhangsan");
    }


    @Bean
    public DemoFactory demoFactory(){
        return new DemoFactory();
    }
}
