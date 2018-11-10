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

	private Mapa mapa;
	private Collection<Entidad> coleccion;
	private Jugador j;
	private Oyente o;
	private Map<String,Character> mapeoInputs;	
	
	public AdministradorDeMovimiento(Mapa m) {
		mapa = m;
		coleccion = mapa.getColeccion();
		j=mapa.getJugador();
		o= new Oyente();
		crearMapeoInputs();
	}
	
	private void crearMapeoInputs() {
		mapeoInputs = new HashMap<String,Character>();
		mapeoInputs.put("Movimiento",'x');
		mapeoInputs.put("Disparo",'x');
		mapeoInputs.put("CambiarArma",'x');
	}
	
	public void run() {
		while(!mapa.termine()) {
			mover();
			moverJugador();
			controlarColisiones();
			mapa.agregarEntidadesPendientes();
			refresh();
			esperar();
		}
		esperar(1000);
	}
	
	private void esperar() {
		//El condicional se usa para mantener estable la velocidad del juego cuando haya muchas entidades en el mapa (Principalmente proyectiles)
		//Esto se da sobre todo en el nivel que contiene a Strelitzia
		int tiempo;
		System.out.println(mapa.getColeccion().size());
		if(mapa.getColeccion().size()>175)
			tiempo=4;
		else
			tiempo=8;
		try {
			Thread.sleep(tiempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void esperar(int tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Oyente getOyente(){
		return o;
	}

	private void mover() {
		for(Entidad e: coleccion) 
			e.mover();
	}

	private void controlarColisiones() {
			HashMap<Entidad,Entidad> mapeoColisiones = new HashMap<Entidad,Entidad>();
			for(Entidad e1: coleccion) 
				for(Entidad e2: coleccion) 
					colisionar(e1,e2, mapeoColisiones);			
			eliminarEntidades();
	}
	
	private void colisionar(Entidad e1, Entidad e2, HashMap<Entidad,Entidad> mapeoColisiones){
		if(e1.estaViva() && e2.estaViva() && mapeoColisiones.get(e1)!=e2 && mapeoColisiones.get(e2)!=e1) {
			if(mapa.colision(e1, e2))
				actualizarMapeo(e1, e2, mapeoColisiones);
		}
	}
	
	private void actualizarMapeo(Entidad e1, Entidad e2, HashMap<Entidad,Entidad> mapeoColisiones)	{
		mapeoColisiones.put(e1, e2);
		mapeoColisiones.put(e2, e1);
	}
	
	private void eliminarEntidades() {
		Collection<Entidad> coleccionBorrar = new LinkedList<Entidad>();
		for(Entidad e : coleccion)
			if(!e.estaViva())
				coleccionBorrar.add(e);
		for(Entidad e : coleccionBorrar)
			mapa.remover(e);
	}
	
	private void refresh() { 
		for(Entidad e: coleccion)
			e.getGrafico().actualizar();
		mapa.getMapaGrafico().actualizar();
	}

	private void moverJugador() {
		evaluarMovimiento();
		cambiarArma();
		disparar();
	}
	
	private void evaluarMovimiento() {
		char dir = mapeoInputs.get("Movimiento");
		if (dir == 'd')
			j.moverDerecha();
		else if (dir == 'a')
			j.moverIzquierda();
	}
	
	private void cambiarArma()	{
		if(mapeoInputs.get("CambiarArma") == 'l') {
			j.cambiarArma();
			mapeoInputs.put("CambiarArma", 'x');
		}
	}
	
	private void disparar() {
		char disp = mapeoInputs.get("Disparo");
		if(disp == ' ')
			j.disparar();
	}
	
	public class Oyente implements KeyListener {
		
		public void keyPressed(KeyEvent key) {
			if(esA(key)) 
				mapeoInputs.put("Movimiento", 'a');
			else if(esD(key))
					mapeoInputs.put("Movimiento", 'd');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", ' ');
			if(esL(key))
				mapeoInputs.put("CambiarArma", 'l');
		}

		public void keyReleased(KeyEvent key) {
			if(esA(key)) 
				mapeoInputs.put("Movimiento", 'x');
			else if(esD(key))
					mapeoInputs.put("Movimiento", 'x');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", 'x');
		}
		
		private boolean esA(KeyEvent key) {
			return key.getKeyChar() == 'a' || key.getKeyChar() == 'A';
		}
		
		private boolean esD(KeyEvent key) {
			return key.getKeyChar() == 'd' || key.getKeyChar() == 'D';
		}
		
		private boolean esL(KeyEvent key) {
			return key.getKeyChar() == 'l' || key.getKeyChar() == 'L';			
		}

		public void keyTyped(KeyEvent key) { }		
	}
}