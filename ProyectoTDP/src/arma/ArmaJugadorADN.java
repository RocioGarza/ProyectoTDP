package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilJugadorADNAzul;
import proyectil.ProyectilJugadorADNNaranja;

public class ArmaJugadorADN extends ArmaJugador {

	public ArmaJugadorADN(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaProyectil.png"));
	}
	
	public void disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(200-velocidad)) {
			enfriamientoDisparo=System.currentTimeMillis();
			Entorno.getEntorno().agregarEntidad(new ProyectilJugadorADNAzul(posDisparo.getX()+(posDisparo.getAncho()/2)-12, posDisparo.getY()-posDisparo.getAlto()/8, daño, velocidad));
			Entorno.getEntorno().agregarEntidad(new ProyectilJugadorADNNaranja(posDisparo.getX()+(posDisparo.getAncho()/2)-12, posDisparo.getY()-posDisparo.getAlto()/8, daño, velocidad));
		}
	}

}
