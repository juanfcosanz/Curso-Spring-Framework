package problema07;

public class ExampleBean3 {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int i;

	private ExampleBean3() {

	}

	public static ExampleBean3 createInstance(AnotherBean beanOne,YetAnotherBean beanTwo, int i) {
		ExampleBean3 eb = new ExampleBean3();
		return eb;

	}
}
