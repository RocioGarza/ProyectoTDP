package arma;

import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilEnemigoBasico;

public class ArmaEnemigo extends Arma {

	public ArmaEnemigo(Posicion p) {
		super(p);
	}
	
	public void disparar(int da�o, int velocidad) {
		Entorno.getEntorno().agregarEntidad(new ProyectilEnemigoBasico(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, da�o, velocidad));
	}
}
