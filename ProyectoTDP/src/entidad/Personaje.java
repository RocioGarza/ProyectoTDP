package entidad;

public abstract class Personaje extends Entidad {
	
	protected int dañoAtaque;
	protected int velocidadDeAtaque;

	public Personaje(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
	}
	
	public abstract void atacar();

	public void aumentarDaño(int d) {
		dañoAtaque = dañoAtaque + d;
	}
	
	public void disminuirDaño(int d) {
		if (dañoAtaque-d<0)
			dañoAtaque=0;
		else
			dañoAtaque = dañoAtaque - d;
	}
}
