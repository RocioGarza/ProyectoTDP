package obstaculo;

public class Irrompible extends Obstaculo {

	private IrrompibleGrafico grafico;
	
	public Irrompible (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida);	
		grafico = new IrrompibleGrafico(X, Y, alto, ancho, VM);
	}
	
	public IrrompibleGrafico getAlphaGrafico() {
		return grafico;
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
}
