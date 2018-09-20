package proyectil;

import entidad.Entidad;
import entidad.Posicion;

public abstract class Proyectil extends Entidad {

	protected int da�o;
	
	public Proyectil(int X, int Y, int da�o, int VM) {
		super(X,Y,getAlto(), getAncho());
		velocidadDeMovimiento = VM;
		this.da�o=da�o;
	}
	
	public static int getAncho() {
		return 16;
	}
	
	public static int getAlto() {
		return 25;
	}
	
	public int getDa�o() {
		return da�o;
	}
	
	public void mover() {
		pos.moverY(-velocidadDeMovimiento);
		if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
			vida=0;
	}
}
