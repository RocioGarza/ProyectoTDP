package entidad;

public abstract class Personaje extends Entidad {
	
	protected int da�oAtaque;
	protected int velocidadDeAtaque;

	public Personaje(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
	}
	
	public abstract void atacar();

	public void aumentarDa�o(int d) {
		da�oAtaque = da�oAtaque + d;
	}
	
	public void disminuirDa�o(int d) {
		if (da�oAtaque-d<0)
			da�oAtaque=0;
		else
			da�oAtaque = da�oAtaque - d;
	}
}
