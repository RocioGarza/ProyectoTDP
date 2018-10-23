package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilJugadorCohete;

public class ArmaJugadorCohete extends ArmaJugador{

	public ArmaJugadorCohete(Posicion p) {
		super(p);
		icono = new ImageIcon(this.getClass().getResource("/Graficos/ArmaMisil.png"));
	}
	
	public void disparar(int daño, int velocidad) {
		if(System.currentTimeMillis()-enfriamientoDisparo>(250-velocidad)) {
			enfriamientoDisparo=System.currentTimeMillis();
			Entorno.getEntorno().agregarEntidad(new ProyectilJugadorCohete(posDisparo.getX()+(posDisparo.getAncho()/2)-15, posDisparo.getY()-posDisparo.getAlto()/12, daño));
		}
	}
}
