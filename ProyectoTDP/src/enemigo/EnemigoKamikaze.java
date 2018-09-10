package enemigo;

public abstract class EnemigoKamikaze extends Enemigo {

	protected int dañoImpacto;
	
	public EnemigoKamikaze (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, daño, VA);	
	}
	
	public int getDañoImpacto() {
		return dañoImpacto;
	}
}
