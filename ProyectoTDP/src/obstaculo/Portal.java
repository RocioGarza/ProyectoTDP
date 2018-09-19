package obstaculo;

public class Portal extends Obstaculo {

	private PortalGrafico grafico;
	
	public Portal (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new PortalGrafico(pos);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public PortalGrafico getGrafico() {
		return grafico;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
}
