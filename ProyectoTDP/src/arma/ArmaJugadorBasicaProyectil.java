package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Mapa;
import proyectil.ProyectilJugadorBasico;

public class ArmaJugadorBasicaProyectil extends ArmaJugador {

	public ArmaJugadorBasicaProyectil(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaBasicaProyectil.png"));
	}
	
	public void disparar(int da�o, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(velocidad*50)) {
			enfriamientoDisparo=System.currentTimeMillis();
			Mapa.agregarEntidad(new ProyectilJugadorBasico(posDisparo.getX()+(posDisparo.getAncho()/2), posDisparo.getY()-posDisparo.getAlto()/8, da�o, velocidad));
		}
	}

}
