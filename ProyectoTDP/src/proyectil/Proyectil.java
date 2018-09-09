package proyectil;

import elemento.Elemento;

public abstract class Proyectil extends Elemento {

	protected int daño;
	
	public Proyectil(int X, int Y, int alto, int ancho, int VM, int daño) {
		super(X,Y,alto,ancho,VM);
		this.daño=daño;
	}
	
	public int getDaño() {
		return daño;
	}
}
