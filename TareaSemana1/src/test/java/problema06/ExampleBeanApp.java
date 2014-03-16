package problema06;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBeanApp {


	private static ApplicationContext fabrica;
	@Test
	public static void main(String[] args) throws Exception {
		
		fabrica = new ClassPathXmlApplicationContext("p06/app-06.xml");
		ExampleBean example = fabrica.getBean("exampleBean",ExampleBean.class);
		System.out.print("Años: "+ example.getYears());
		System.out.print("\nMensaje: "+ example.getUltimateAnswer());
	}

}
