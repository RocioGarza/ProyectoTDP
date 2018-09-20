package obstaculo;

import entidad.Entidad;
import proyectil.ProyectilJugador;

public abstract class Obstaculo extends Entidad {

	public Obstaculo (int X, int Y, int alto, int ancho) {
		super(X,Y,alto,ancho);
		vidaMaxima=100;
		vida=100;
	}
	
	protected boolean serColisionado(ProyectilJugador p) {
		vida=vida-p.getDaño();
		return true;
	}
}
