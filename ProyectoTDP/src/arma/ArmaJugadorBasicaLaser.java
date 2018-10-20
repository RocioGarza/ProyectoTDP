package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Mapa;
import proyectil.Proyectil;
import proyectil.ProyectilJugadorLaser;

public class ArmaJugadorBasicaLaser extends ArmaJugador{

	public ArmaJugadorBasicaLaser(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaLaser.png"));

	}
	
	public void disparar(int da�o, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>8) {
			enfriamientoDisparo=System.currentTimeMillis();
			Mapa.agregarEntidad(new ProyectilJugadorLaser(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, (1 + da�o/10), velocidad));
		}
	}

}
