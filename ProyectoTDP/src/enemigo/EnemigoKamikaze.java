package enemigo;

public abstract class EnemigoKamikaze extends Enemigo {

	protected int dañoImpacto;
	
	public EnemigoKamikaze (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
	}
	
	public int getDañoImpacto() {
		return dañoImpacto;
	}
	
	public abstract void terminarAtaque();
	
	
}
