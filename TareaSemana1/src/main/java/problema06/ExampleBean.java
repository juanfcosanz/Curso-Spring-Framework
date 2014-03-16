package problema06;

import java.beans.ConstructorProperties;

public class ExampleBean {
	
	private int years;
	private String ultimateAnswer;
	
	@ConstructorProperties({"years","ultimateAnswer"})
	public ExampleBean(int years, String ultimateAnswer) {
		super();
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}

	public int getYears() {
		return years;
	}

	public String getUltimateAnswer() {
		return ultimateAnswer;
	}

	
	
	
	
}
