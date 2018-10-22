package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Mapa;
import proyectil.ProyectilJugadorMulti;

public class ArmaJugadorMultiDisparo extends ArmaJugador {

	public ArmaJugadorMultiDisparo(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaMulti.png"));
	}
	
	public void disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(velocidad*75)) {
			enfriamientoDisparo=System.currentTimeMillis();
			Mapa.agregarEntidad(new ProyectilJugadorMulti(posDisparo.getX()+(posDisparo.getAncho()/6), posDisparo.getY()-posDisparo.getAlto()/4, (1+daño/2), velocidad));
			Mapa.agregarEntidad(new ProyectilJugadorMulti(posDisparo.getX()+(5*posDisparo.getAncho()/6), posDisparo.getY()-posDisparo.getAlto()/4, (1+daño/2), velocidad));
			Mapa.agregarEntidad(new ProyectilJugadorMulti(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, (1+daño/2), velocidad));
		}
	}

}
