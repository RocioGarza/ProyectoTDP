package proyectil;

import entidad.Entidad;

public abstract class Proyectil extends Entidad {

	protected int da�o;
	
	public Proyectil(int X, int Y, int alto, int ancho, int da�o, int VM) {
		super(X,Y, alto, ancho);
		velocidadDeMovimiento = VM;
		this.da�o=da�o;
	}
	
	public int getDa�o() {
		return da�o;
	}
	
	public void mover() {}
}
