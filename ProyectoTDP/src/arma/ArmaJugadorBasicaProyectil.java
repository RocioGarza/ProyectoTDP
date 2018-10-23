package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilJugadorBasico;

public class ArmaJugadorBasicaProyectil extends ArmaJugador {

	public ArmaJugadorBasicaProyectil(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaProyectil.png"));
	}
	
	public void disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(300-velocidad)) {
			enfriamientoDisparo=System.currentTimeMillis();
			Entorno.getEntorno().agregarEntidad(new ProyectilJugadorBasico(posDisparo.getX()+(posDisparo.getAncho()/2)-12, posDisparo.getY()-posDisparo.getAlto()/8, daño, velocidad));
		}
	}

}
