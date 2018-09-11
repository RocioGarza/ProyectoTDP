package obstaculo;

public class Pared extends Obstaculo {

	private ParedGrafica grafico;
	
	public Pared (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ParedGrafica(X, Y, getAlto(), getAncho(), 0);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public ParedGrafica getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
