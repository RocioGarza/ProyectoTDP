package logica;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import entidad.Entidad;
import jugador.Jugador;

public class AdministradorDeMovimiento extends Thread{

	private Map<String,Character> mapeoInputs;
	private Jugador j;
	private Oyente o;
	private Collection<Entidad> coleccion;
	private Mapa mapa;
	
	public AdministradorDeMovimiento(Mapa m) {
		this.mapa = m;
		coleccion = mapa.getColeccion();
		
		o= new Oyente();
		
		mapeoInputs = new HashMap<String,Character>();
		mapeoInputs.put("Movimiento",'x');
		mapeoInputs.put("Disparo",'x');
		mapeoInputs.put("CambiarArma",'x');
		
		this.j=mapa.getJugador();
	}
	
	public void run() {
		while(!mapa.termine()) {
			mover();
			moverJugador();
			controlarColisiones();
			mapa.agregarEntidadesPendientes();
			refresh();
			try {
				Thread.sleep(8);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("termino el juego");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.exit(0);
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
			mapa.getMapaGrafico().actualizar();
		} catch (Exception e) {
			System.out.println("Voy a tirar una excepcion");
			e.printStackTrace();
		}
	}
	
	public Oyente getOyente(){
		return o;
	}

	private void moverJugador() {
		j.mover(mapeoInputs.get("Movimiento"));
		if(mapeoInputs.get("CambiarArma")=='l') {
			j.cambiarArma();
			mapeoInputs.put("CambiarArma", 'x');
		}
		mapa.getJugador().disparar(mapeoInputs.get("Disparo"));
	}
	
	public class Oyente implements KeyListener {
		
		public void keyPressed(KeyEvent key) {
			if(key.getKeyChar() == 'a') {
				mapeoInputs.put("Movimiento", 'a');
			}
			else
				if(key.getKeyChar() == 'd')
					mapeoInputs.put("Movimiento", 'd');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", ' ');
			if(key.getKeyChar() == 'l')
				mapeoInputs.put("CambiarArma", 'l');
		}

		public void keyReleased(KeyEvent key) {
			if(key.getKeyChar() == 'a') 
				mapeoInputs.put("Movimiento", 'x');
			else
				if(key.getKeyChar() == 'd')
					mapeoInputs.put("Movimiento", 'x');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", 'x');
		}

		public void keyTyped(KeyEvent key) { }		
	}
}