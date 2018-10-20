package enemigo;

public abstract class EnemigoKamikaze extends Enemigo {

	protected int da�oImpacto;
	
	public EnemigoKamikaze (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
	}
	
	public int getDa�oImpacto() {
		return da�oImpacto;
	}
	
	public abstract void terminarAtaque();
	
	
}
