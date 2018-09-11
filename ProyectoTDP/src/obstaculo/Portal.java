package obstaculo;

public class Portal extends Obstaculo {

	private PortalGrafico grafico;
	
	public Portal (int X, int Y) {
		super(X, Y, 100, 190);	
		grafico = new PortalGrafico(X, Y, 100, 190, 0);
	}
	
	public PortalGrafico getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
