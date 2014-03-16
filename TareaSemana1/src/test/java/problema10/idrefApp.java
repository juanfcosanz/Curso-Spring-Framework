package problema10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class idrefApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		fabrica = new ClassPathXmlApplicationContext("p10/app-10.xml");
		idref sal = fabrica.getBean("theClientBean",idref.class);
		System.out.print(sal.getTargetaName());

	}

}
