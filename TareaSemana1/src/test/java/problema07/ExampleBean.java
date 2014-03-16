package problema07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBean {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		
		
		fabrica = new ClassPathXmlApplicationContext("p07/app-07.xml");
		ExampleBean3 example2 = fabrica.getBean("exampleBean",ExampleBean3.class);
		
		
	}

}
