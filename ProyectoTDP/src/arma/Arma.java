package arma;

import entidad.Posicion;
import proyectil.Proyectil;

public abstract class Arma {
	
	protected Posicion posDisparo;
	
	public Arma(Posicion p) {
		this.posDisparo = p;
	}
	
	public Proyectil disparar(int da�o, int velocidad) {
		return null;
	}
}
