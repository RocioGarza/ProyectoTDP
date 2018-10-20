package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import proyectil.Proyectil;
import proyectil.ProyectilJugador;

public class ArmaJugadorBasicaProyectil extends ArmaJugador {

	public ArmaJugadorBasicaProyectil(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaProyectil.png"));
	}
	
	public Proyectil disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(velocidad*50)) {
			enfriamientoDisparo=System.currentTimeMillis();
			return new ProyectilJugador(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, daño, velocidad);
		} else
			return null;
	}

}
