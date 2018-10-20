package arma;

import entidad.Posicion;
import proyectil.Proyectil;

public abstract class Arma {
	
	protected Posicion posDisparo;
	
	public Arma(Posicion p) {
		this.posDisparo = p;
	}
	
	public abstract void disparar(int daño, int velocidad);
}
