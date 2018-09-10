package obstaculo;

public class Pared extends Obstaculo {

	private ParedGrafica grafico;
	
	public Pared (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida);	
		grafico = new ParedGrafica(X, Y, alto, ancho, VM);
	}
	
	public ParedGrafica getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
