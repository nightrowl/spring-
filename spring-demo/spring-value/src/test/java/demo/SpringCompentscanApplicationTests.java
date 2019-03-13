package demo;

import com.jokerkiki.demo.config.DemoConfig;
import com.jokerkiki.demo.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringCompentscanApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void demoTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		//加载方法名及id，获取依赖注入的bean
		Person person = (Person)ac.getBean("person1");
		System.out.println(person);
	}

	@Test
	public void scanTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		String[] names = ac.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}
	}
}
