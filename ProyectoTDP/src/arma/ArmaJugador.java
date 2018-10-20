package arma;

import javax.swing.ImageIcon;

import entidad.Posicion;

public abstract class ArmaJugador extends Arma {

	protected long enfriamientoDisparo;
	protected ImageIcon icono;
	
	public ArmaJugador(Posicion p) {
		super(p);
		enfriamientoDisparo=-1000;
	}
		
	public ImageIcon getIcono(){
		return icono;
	}
}
