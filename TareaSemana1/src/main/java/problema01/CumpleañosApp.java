package problema01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CumpleañosApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		
		fabrica = new ClassPathXmlApplicationContext("app-config02.xml");
		Cumpleaños info = fabrica.getBean("NewdiaCumple", Cumpleaños.class);
		SignoZodiacal info2 = fabrica.getBean("Newsigno",SignoZodiacal.class);
		info.getDiaCumple();
		info2.getSignoZodical();
		
	}

}
