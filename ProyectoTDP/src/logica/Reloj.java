package logica;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import entidad.Entidad;

public class Reloj extends Thread{
	
	private Collection<Entidad> coleccion;
	private Map<String,Character> mapeoInputs;
	private Mapa mapa;
	
	public Reloj(Mapa mapa, Map<String,Character> mapeo) {
		this.mapa = mapa;
		coleccion = mapa.getColeccion();
		mapeoInputs = mapeo;
	}
	
	public void run() {
		while(true) {
			mover();
			moverJugador();
			controlarColisiones();
			refresh();
			controlarJuego();
			mapa.agregarEntidadesPendientes();
			try {
				Thread.sleep(8);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void mover() {
		try {
			for(Entidad e: coleccion) {
				e.mover();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void refresh() { 
		try {
			for(Entidad e: coleccion)
				e.getGrafico().actualizar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void moverJugador() {
		mapa.getJugador().mover(mapeoInputs.get("Movimiento"));
		if(mapeoInputs.get("CambiarArma")=='l') {
			mapa.getJugador().cambiarArma();
			mapeoInputs.put("CambiarArma", 'x');
		}
		mapa.getJugador().disparar(mapeoInputs.get("Disparo"));
	}
	
	private void controlarJuego() {
		if (!mapa.getJugador().estaViva()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.exit(0);
		}
		
		if (mapa.getEnemigosRestantes()==0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.exit(0);
		}
	}
}