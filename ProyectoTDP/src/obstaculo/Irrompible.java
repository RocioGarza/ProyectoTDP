package obstaculo;

public class Irrompible extends Obstaculo {

	private IrrompibleGrafico grafico;
	
	public Irrompible (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new IrrompibleGrafico(pos);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public IrrompibleGrafico getGrafico() {
		return grafico;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
}
