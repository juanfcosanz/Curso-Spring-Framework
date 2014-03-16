package problema16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonBeanApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		
		fabrica = new ClassPathXmlApplicationContext("p16/app-1602.xml");
		PersonaBean person = fabrica.getBean("john-modern",PersonaBean.class);
		System.out.print("Mensaje: "+person.getName());
		System.out.print("\nMensaje: "+person.getSpouse());
	}

}
