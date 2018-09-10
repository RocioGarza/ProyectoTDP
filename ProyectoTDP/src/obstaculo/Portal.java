package obstaculo;

public class Portal extends Obstaculo {

	private PortalGrafico grafico;
	
	public Portal (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida);	
		grafico = new PortalGrafico(X, Y, alto, ancho, VM);
	}
	
	public PortalGrafico getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
