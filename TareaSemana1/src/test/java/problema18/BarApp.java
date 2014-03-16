package problema18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BarApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		
		fabrica = new ClassPathXmlApplicationContext("p18/app-18.xml");
		Bar bar = fabrica.getBean("foo",Bar.class);
		System.out.println("Mesaje: "+bar.getSammy());

	}

}
