package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilJugadorLaser;

public class ArmaJugadorBasicaLaser extends ArmaJugador{

	public ArmaJugadorBasicaLaser(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaLaser.png"));

	}
	
	public void disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>8) {
			enfriamientoDisparo=System.currentTimeMillis();
			Entorno.getEntorno().agregarEntidad(new ProyectilJugadorLaser(posDisparo.getX()+(posDisparo.getAncho()/2)-8, posDisparo.getY()-posDisparo.getAlto()/8-23, (1 + daño/10), velocidad));
		}
	}

}
