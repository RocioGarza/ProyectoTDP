package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Entorno;
import proyectil.BuscadorObjetivo;
import proyectil.ProyectilJugadorArcoiris;

public class ArmaJugadorArcoiris extends ArmaJugador{

	public ArmaJugadorArcoiris(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaArcoiris.png"));
	}
	
	public void disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(50-velocidad)) {
			enfriamientoDisparo=System.currentTimeMillis();
			Entorno.getEntorno().agregarEntidad(crearProyectil(daño, velocidad));
		}
	}
	
	private ProyectilJugadorArcoiris crearProyectil(int daño, int velocidad) {
		ProyectilJugadorArcoiris p = new ProyectilJugadorArcoiris(posDisparo.getX()+(posDisparo.getAncho()/2)-15, posDisparo.getY()-posDisparo.getAlto()/12, (velocidad/2)+1,velocidad);
		BuscadorObjetivo buscador = new BuscadorObjetivo(p);
		Entorno.getEntorno().serAfectado(buscador);
		return p;
	}
}
