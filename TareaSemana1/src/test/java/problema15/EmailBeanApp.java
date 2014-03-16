package problema15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailBeanApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		fabrica = new ClassPathXmlApplicationContext("p15/app-15.xml");
		EmailBean email = fabrica.getBean("email",EmailBean.class);
		System.out.println(email.getEmail());

	}

}
