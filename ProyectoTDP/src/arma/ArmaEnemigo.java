package arma;

import entidad.Posicion;
import proyectil.Proyectil;
import proyectil.ProyectilEnemigo;

public class ArmaEnemigo extends Arma {

	public ArmaEnemigo(Posicion p) {
		super(p);
	}
	
	public Proyectil disparar(int da�o, int velocidad) {
		return new ProyectilEnemigo(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, da�o, velocidad);
	}
}
