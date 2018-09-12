package obstaculo;

public class Rebote extends Obstaculo {

	private ReboteGrafico grafico;
	
	public Rebote (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ReboteGrafico(X, Y, getAlto(), getAncho(), 0);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public ReboteGrafico getGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
