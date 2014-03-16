package problema02;

public class SerieDeTvImpl implements SerieDeTv {
	
	private String horario;
	@Override
	public void gethorarioSerie() {
		System.out.println(horario);

	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	

}
