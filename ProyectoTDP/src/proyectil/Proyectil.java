package proyectil;

import entidad.Entidad;

public abstract class Proyectil extends Entidad {

	protected int daño;
	
	public Proyectil(int X, int Y, int alto, int ancho, int daño, int VM) {
		super(X,Y, alto, ancho);
		velocidadDeMovimiento = VM;
		this.daño=daño;
	}
	
	public int getDaño() {
		return daño;
	}
	
	public void mover() {}
}
