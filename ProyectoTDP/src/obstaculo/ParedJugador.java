package obstaculo;

public class ParedJugador extends Obstaculo {
	
	private ParedJugadorGrafica grafico;
	
	public ParedJugador (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ParedJugadorGrafica(X, Y, getAlto(), getAncho(), 0);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public ParedJugadorGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
