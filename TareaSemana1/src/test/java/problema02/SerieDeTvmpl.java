package problema02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SerieDeTvmpl {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext fabrica = new ClassPathXmlApplicationContext("p02/app-02.xml");
		SerieDeTv horario = fabrica.getBean("NewHorario",SerieDeTv.class);
		horario.gethorarioSerie();

	}

}
