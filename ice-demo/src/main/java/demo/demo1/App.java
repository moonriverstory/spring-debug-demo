package demo.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{
	public static void main( String[] args )
	{
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		String XMLPath = "D:/IdeaProject/spring-framework-master/" +
				"ice-demo/src/main/resources/spring-demo-context.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
		ILogin login = (ILogin)applicationContext.getBean("loginService");
	}
}
