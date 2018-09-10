package obstaculo;

public class ParedJugador extends Obstaculo {
	
	private ParedJugadorGrafica grafico;
	
	public ParedJugador (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida);	
		grafico = new ParedJugadorGrafica(X, Y, alto, ancho, VM);
	}
	
	public ParedJugadorGrafica getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
