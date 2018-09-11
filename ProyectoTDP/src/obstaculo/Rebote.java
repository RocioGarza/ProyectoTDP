package obstaculo;

public class Rebote extends Obstaculo {

	private ReboteGrafico grafico;
	
	public Rebote (int X, int Y) {
		super(X, Y, 100, 190);	
		grafico = new ReboteGrafico(X, Y, 100, 190, 0);
	}
	
	public ReboteGrafico getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
