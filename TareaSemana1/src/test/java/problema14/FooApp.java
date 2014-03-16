package problema14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {

		fabrica = new ClassPathXmlApplicationContext(
				"p14/app-14.xml");
		Foo map = fabrica.getBean("foo", Foo.class);

		System.out.print("Mensaje: " + map.getAccounts());
	}

}
