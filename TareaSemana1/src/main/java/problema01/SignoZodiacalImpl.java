package problema01;

public class SignoZodiacalImpl implements SignoZodiacal {
	
	private String signo;
	
	public void setSigno(String signo) {
		this.signo = signo;
	}

	@Override
	public void getSignoZodical() {
		System.out.println("\n"+signo);
		
	}



}
