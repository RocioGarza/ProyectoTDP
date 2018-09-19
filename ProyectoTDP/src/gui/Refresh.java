package gui;

import java.util.Collection;

import entidad.Entidad;
import logica.Mapa;

public class Refresh extends Thread{
	
private Collection<Entidad> coleccion;
	
	public Refresh(Mapa mapa) {
		coleccion = mapa.getColeccion();
	}

	public void run() {
		while (true) {
			for(Entidad e : coleccion)
				e.getGrafico().actualizar();
		}
	}
}
