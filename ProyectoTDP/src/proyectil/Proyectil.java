package proyectil;

import entidad.Entidad;

public abstract class Proyectil extends Entidad {

	protected int daño;
	
	public Proyectil(int X, int Y, int daño, int VM) {
		super(X,Y,getAlto(), getAncho());
		velocidadDeMovimiento = VM;
		this.daño=daño;
	}
	
	public static int getAncho() {
		return 16;
	}
	
	public static int getAlto() {
		return 25;
	}
	
	public int getDaño() {
		return daño;
	}
	
	public Proyectil mover() {
		return null;
	}
}
