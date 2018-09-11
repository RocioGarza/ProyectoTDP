package proyectil;

import elemento.Elemento;

public abstract class Proyectil extends Elemento {

	protected int daño;
	
	public Proyectil(int X, int Y, int alto, int ancho, int VM, int daño) {
		super(X,Y,getAlto(), getAncho());
		velocidadDeMovimiento = VM;
		this.daño=daño;
	}
	
	public static int getAncho() {
		return 5;
	}
	
	public static int getAlto() {
		return 10;
	}
	
	public int getDaño() {
		return daño;
	}
	
	public void mover(char c) {
		pos.moverY(velocidadDeMovimiento);
	}
}
