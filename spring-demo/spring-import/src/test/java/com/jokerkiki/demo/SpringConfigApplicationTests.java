package com.jokerkiki.demo;

import com.jokerkiki.demo.config.DemoConfig;
import com.jokerkiki.demo.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConfigApplicationTests {

	@Test
	public void contextLoads() {
	}


	/**
	 *给容器中注册组件方式
	 * 1.spring 自带  controller /service/component...etc..
	 * 2.@Bean注解  通过自带构造器注入
	 *
	 * 3@import方式 : 快速给容器中导入一个组件
	 * id为全路径类名
	 *
	 */
	@Test
	public void demoTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		String[] names = ac.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}
	}
}
