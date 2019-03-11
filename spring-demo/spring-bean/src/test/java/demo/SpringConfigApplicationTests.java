package demo;

import com.jokerkiki.demo.config.DemoConfig;
import com.jokerkiki.demo.entity.Children;
import com.jokerkiki.demo.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConfigApplicationTests {

	@Test
	public void demoTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);

		//加载方法名及id，获取依赖注入的bean
		/*Person person = (Person)ac.getBean("person");
		System.out.println(person);
		Children children = (Children)ac.getBean("child");
		System.out.println(children);*/
		ac.close();
	}
}
