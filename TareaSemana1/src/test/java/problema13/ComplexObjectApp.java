package problema13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexObjectApp {

	public static void main(String[] args) {
		ApplicationContext fabrica = new ClassPathXmlApplicationContext("p13/app-13.xml");
		ComplexObject app = fabrica.getBean("parent",ComplexObject.class);
		System.out.print(app.getAdministrator());
		

	}

}
