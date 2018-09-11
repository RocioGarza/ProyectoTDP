package obstaculo;

public class Irrompible extends Obstaculo {

	private IrrompibleGrafico grafico;
	
	public Irrompible (int X, int Y) {
		super(X, Y, 100, 190);	
		grafico = new IrrompibleGrafico(X, Y, 100, 190, 0);
	}
	
	public IrrompibleGrafico getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
