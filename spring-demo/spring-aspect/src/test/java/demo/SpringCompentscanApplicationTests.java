package demo;

import com.jokerkiki.demo.config.DemoConfig;
import com.jokerkiki.demo.dao.DemoDao;
import com.jokerkiki.demo.service.DemoService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringCompentscanApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void demoTest() throws Exception{
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		//加载方法名及id，获取依赖注入的bean
		DemoDao demoDao = (DemoDao)ac.getBean("demoDao");
		System.out.println(demoDao.demo(0));
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
