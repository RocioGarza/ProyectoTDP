package arma;

import entidad.Posicion;
import proyectil.Proyectil;
import proyectil.ProyectilJugador;

public class ArmaJugador extends Arma {

	public ArmaJugador(Posicion p) {
		super(p);
	}
	
	public Proyectil disparar(int da�o, int velocidad) {
		return new ProyectilJugador(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, da�o, velocidad);
	}
}
