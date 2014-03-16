package problema01;

public class CumpleañosImp implements Cumpleaños {
	
	private String diaCumpleaños;
	
	
	public CumpleañosImp(String diaCumpleaños) {
		super();
		this.diaCumpleaños = diaCumpleaños;
	}



	@Override
	public void getDiaCumple() {
		// TODO Auto-generated method stub
		System.out.print(diaCumpleaños);
	}

}
