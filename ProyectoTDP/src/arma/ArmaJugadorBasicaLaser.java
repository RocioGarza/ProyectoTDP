package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import proyectil.Proyectil;
import proyectil.ProyectilJugadorLaser;

public class ArmaJugadorBasicaLaser extends ArmaJugador{

	public ArmaJugadorBasicaLaser(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaLaser.png"));

	}
	
	public Proyectil disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>8) {
			enfriamientoDisparo=System.currentTimeMillis();
			return new ProyectilJugadorLaser(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, (1 + daño/10), velocidad);
		} else
			return null;
	}

}
