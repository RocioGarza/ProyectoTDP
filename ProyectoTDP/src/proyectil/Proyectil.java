package proyectil;

import elemento.Elemento;

public abstract class Proyectil extends Elemento {

	protected int da�o;
	
	public Proyectil(int X, int Y, int alto, int ancho, int VM, int da�o) {
		super(X,Y,alto,ancho,VM);
		this.da�o=da�o;
	}
	
	public int getDa�o() {
		return da�o;
	}
}
