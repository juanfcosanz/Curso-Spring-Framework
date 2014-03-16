package problema16;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailBeanApp {

	private static ApplicationContext fabrica;

	@Test
	public static void main(String[] args) {
		fabrica = new ClassPathXmlApplicationContext("p16/app-16.xml");
		EmailBean email = fabrica.getBean("classic",EmailBean.class);
		System.out.println(email.getEmail());
	}

}
