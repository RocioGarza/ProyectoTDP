package obstaculo;

public class Pared extends Obstaculo {

	private ParedGrafica grafico;
	
	public Pared (int X, int Y) {
		super(X, Y, 100, 190);	
		grafico = new ParedGrafica(X, Y, 100, 190, 0);
	}
	
	public ParedGrafica getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
