package logica;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import entidad.Entidad;

public class Reloj extends Thread{
	
	private Collection<Entidad> coleccion;
	private Mapa mapa;
	
	public Reloj(Mapa mapa) {
		this.mapa = mapa;
		coleccion = mapa.getColeccion();
	}
	
	public void run() {
		while(true) {
			mover();
			controlarColisiones();
			refresh();
			controlarJugador();
			try {
				Thread.sleep(8);
			} catch (Exception e) {}
		}
	}
	
	private void mover() {
		try {
			Collection<Entidad> coleccionAgregar = new LinkedList<Entidad>();
			Entidad aux;
			for(Entidad e: coleccion) {
				aux = e.mover();
				if(aux!=null) 
					coleccionAgregar.add(aux);
			}
			for(Entidad e: coleccionAgregar) {
				mapa.getColeccion().add(e);
				mapa.getMapaGrafico().agregarGrafico(e.getGrafico());
			}
		} catch (Exception e) {	}	
	}

	private void controlarColisiones() {
		try {
			boolean colicion=false;
			Collection<Entidad> coleccionBorrar = new LinkedList<Entidad>();
			HashMap<Entidad,Entidad> hash = new HashMap<Entidad,Entidad>();
			for(Entidad e1: coleccion) {
				for(Entidad e2: coleccion) {
					if(e1.estaViva() && e2.estaViva() && hash.get(e1)!=e2 && hash.get(e2)!=e1)
						colicion = mapa.colision(e1, e2);
					if(colicion) {
						hash.put(e1, e2);
						hash.put(e2, e1);
					}
					colicion=false;
			}
			}
			for(Entidad e : coleccion)
				if(!e.estaViva())
					coleccionBorrar.add(e);
			for(Entidad e : coleccionBorrar)
				mapa.remover(e);
		} catch (Exception e) {}
	}
	
	private void refresh() { 
		try {
			for(Entidad e: coleccion)
				e.getGrafico().actualizar();
		} catch (Exception e) {}
	}
	
	private void controlarJugador() {
		if (!mapa.getJugador().estaViva()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			
			System.exit(0);
		}
	}
}