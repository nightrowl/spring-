package com.jokerkiki.demo;

import com.jokerkiki.demo.config.DemoConfig;
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
	 * 5.使用spring提供的factotyBean，也就是我们长说的工厂模式
	 */
	@Test
	public void demoTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		String[] names = ac.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}
		Object factoryBean = ac.getBean("demoFactory");
		System.out.println(factoryBean.getClass());
	}
}
