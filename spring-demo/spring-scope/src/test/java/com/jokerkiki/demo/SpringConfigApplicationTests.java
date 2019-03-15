package com.jokerkiki.demo;

import com.jokerkiki.demo.config.DemoConfig;
import com.jokerkiki.demo.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConfigApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void demoTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		//加载方法名及id，获取依赖注入的bean
		Person person = (Person)ac.getBean("person");
		//加载方法名及id，获取依赖注入的bean
		Person person1 = (Person)ac.getBean("person");
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person==person1);
	}
}
