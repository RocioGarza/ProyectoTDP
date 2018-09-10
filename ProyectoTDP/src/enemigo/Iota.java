package enemigo;

public class Iota extends EnemigoArmado{

	private IotaGrafico grafico;

	public Iota (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int da�o, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, da�o, VA);	
		grafico = new IotaGrafico(X, Y, alto, ancho, VM);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover(char c) {
		// TODO Auto-generated method stub
		
	}
	
	public IotaGrafico getAlphaGrafico() {
		return grafico;
	}
}
