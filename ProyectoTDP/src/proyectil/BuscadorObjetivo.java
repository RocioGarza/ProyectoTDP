package proyectil;

import entidad.Entidad;
import entidad.EntidadGrafica;

public class BuscadorObjetivo extends Entidad{

	private ProyectilJugadorArcoiris proyectil;
	
	public BuscadorObjetivo(ProyectilJugadorArcoiris p) {
		super(0,0,0,0);
		proyectil=p;
	}
	
	public void establecerObjetivo(Entidad e) {
		proyectil.establecerObjetivo(e);
	}

	public void mover() {}

	public EntidadGrafica getGrafico() {
		return null;
	}

	public void morir() {}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);;
	}
}
