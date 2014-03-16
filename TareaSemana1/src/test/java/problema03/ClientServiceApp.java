package problema03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		fabrica = new ClassPathXmlApplicationContext("p03/app-03.xml");
		ClientService cliente = fabrica.getBean("clientService",ClientService.class);
		System.out.print(""+cliente.createInstance());
	}

}
