package enemigo;

public abstract class EnemigoKamikaze extends Enemigo {

	protected int da�oImpacto;
	
	public EnemigoKamikaze (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int da�o, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, da�o, VA);	
	}
	
	public int getDa�oImpacto() {
		return da�oImpacto;
	}
}
