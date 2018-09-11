package obstaculo;

public class ParedJugador extends Obstaculo {
	
	private ParedJugadorGrafica grafico;
	
	public ParedJugador (int X, int Y) {
		super(X, Y, 100, 190);	
		grafico = new ParedJugadorGrafica(X, Y, 100, 190, 0);
	}
	
	public ParedJugadorGrafica getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
