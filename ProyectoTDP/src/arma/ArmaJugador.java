package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;
import proyectil.Proyectil;
import proyectil.ProyectilJugador;

public abstract class ArmaJugador extends Arma {

	protected long enfriamientoDisparo;
	protected ImageIcon icono;
	
	public ArmaJugador(Posicion p) {
		super(p);
		enfriamientoDisparo=-1000;
	}
	
	public abstract Proyectil disparar(int daño, int velocidad);
	
	public ImageIcon getIcono(){
		return icono;
	}
}
