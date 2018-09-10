package obstaculo;

public class Rebote extends Obstaculo {

	private ReboteGrafico grafico;
	
	public Rebote (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida);	
		grafico = new ReboteGrafico(X, Y, alto, ancho, VM);
	}
	
	public ReboteGrafico getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
