package proyectil;

import elemento.Elemento;

public abstract class Proyectil extends Elemento {

	protected int da�o;
	
	public Proyectil(int X, int Y, int alto, int ancho, int VM, int da�o) {
		super(X,Y,getAlto(), getAncho());
		velocidadDeMovimiento = VM;
		this.da�o=da�o;
	}
	
	public static int getAncho() {
		return 5;
	}
	
	public static int getAlto() {
		return 10;
	}
	
	public int getDa�o() {
		return da�o;
	}
	
	public void mover(char c) {
		pos.moverY(velocidadDeMovimiento);
	}
}
