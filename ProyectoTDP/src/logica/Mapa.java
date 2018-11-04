package logica;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JPanel;

import enemigo.Strelitzia;
import entidad.Entidad;
import entidad.Posicion;
import jugador.Jugador;

public class Mapa extends Entorno{
	
	private Collection<Entidad> coleccion;
	private MapaGrafico mGraf;
	private Jugador jugador;
	private int contadorEnemigos;
	private int puntaje;
	private Collection<Entidad> entidadesAAgregar;
	
	//Si n es un nivel valido lo usa, si n es 0 usa el ultimo nivel random generado, si n es otro nro crea un nuevo nivel random
	public Mapa (Jugador j,int n){
		File nivel;
		String dir = "nivel" + n + ".txt"; 
        nivel = new File(dir); 
        
        if( ! nivel.exists()) { 
        	GeneradorDeNiveles gen = new GeneradorDeNiveles();
        	dir ="nivel0.txt";
        	nivel = gen.getNivel();
        }
        
        GeneradorMapa gen = new GeneradorMapa(dir);
        jugador = j; 
        puntaje = 0;
        /* Mapa normal
        coleccion = gen.getColeccion();
        contadorEnemigos = gen.getCantidadEnemigos();
        coleccion.add(jugador);
        */
        
        coleccion = new LinkedList<Entidad>();
        coleccion.add(new Strelitzia(500,100));
        contadorEnemigos = 1;
        coleccion.add(jugador);
        mGraf = new MapaGrafico(coleccion);
        
        entorno = this;
        
        entidadesAAgregar = new LinkedList<Entidad>();    
	}	
	
	public MapaGrafico getMapaGrafico() {
		return mGraf;
	}
	
	public JPanel getGrafico(){
		return mGraf.getGrafica();
	} //este metodo es un asco
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public Collection<Entidad> getColeccion(){
		return coleccion;
	}
	
	public boolean colision(Entidad e1, Entidad e2) {
		boolean colision = false;
		colision = controlarHitbox(e1, e2);
		if (colision) {
			e1.chocar(e2);
			e2.chocar(e1);
		}
		return colision;
	}
	
	public void remover(Entidad e1) {
		e1.morir();
		puntaje = puntaje + e1.getPuntaje();
		mGraf.removerGrafico(e1.getGrafico());
		coleccion.remove(e1);
	}
	
	private boolean controlarHitbox(Entidad e1, Entidad e2) {
		Posicion posicion1 = e1.getPosicion();
		Posicion posicion2 = e2.getPosicion();
		return perteneceAlCuadrado(posicion1.getX(),posicion1.getY(),posicion2)
				|| perteneceAlCuadrado(posicion1.getX() + posicion1.getAncho(),posicion1.getY(),posicion2)
				|| perteneceAlCuadrado(posicion1.getX(),posicion1.getY() + posicion1.getAlto(),posicion2)
				|| perteneceAlCuadrado(posicion1.getX() + posicion1.getAncho(),posicion1.getY() + posicion1.getAlto(),posicion2);
	} //este metodo no ceberia estar aca
	
	private boolean perteneceAlCuadrado(int X, int Y, Posicion posicion) {
		return (X>= posicion.getX() 
				&& X<=posicion.getX()+posicion.getAncho()) 
				&& (Y>= posicion.getY() 
				&& Y<=posicion.getY()+posicion.getAlto() );
	} //ni este
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public boolean termine() {		
		return !jugador.estaViva() || contadorEnemigos==0;
	}

	public int finalizarMapa() {
		return puntaje;
	}
	
	public int getEnemigosRestantes() {
		return contadorEnemigos;
	}
	
	public void agregarEntidadesPendientes() {
		for(Entidad e: entidadesAAgregar) {
			coleccion.add(e);
			mGraf.agregarGrafico(e.getGrafico());
		}
		entidadesAAgregar.clear();
	}
	
	public void reducirEnemigos() {
		contadorEnemigos--;
	}
	
	public void agregarEntidad(Entidad e) {
		entidadesAAgregar.add(e);
	}
	
	public void afectar(Entidad e) {
		for(Entidad ent: coleccion) {
			ent.chocar(e);
		}
	}
	
	public void serAfectado(Entidad e) {
		for(Entidad ent: coleccion) {
			e.chocar(ent);
		}
	}
}