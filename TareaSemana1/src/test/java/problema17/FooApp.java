package problema17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooApp {

	private static ApplicationContext fabrica;

	public static void main(String[] args) {
		fabrica = new ClassPathXmlApplicationContext("p17/app-17.xml");
		Foo app = fabrica.getBean("foo",Foo.class);
		System.out.print("Mensaje: "+app.getEmail());
	}

}
