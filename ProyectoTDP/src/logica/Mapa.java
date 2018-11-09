package logica;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

import entidad.Entidad;
import entidad.Posicion;
import jugador.Jugador;

public class Mapa extends Entorno{
	
	private Collection<Entidad> coleccion;
	private MapaGrafico mGraf;
	private Jugador jugador;
	private int cantEnemigos;
	private int puntaje;
	private Collection<Entidad> entidadesAAgregar;
	
	public Mapa (Jugador j, int n){
        jugador = j; 
        puntaje = 0;
        GeneradorMapa gen = generarMapa(n);
        cantEnemigos = gen.getCantidadEnemigos();
        coleccion = gen.getColeccion();
        coleccion.add(jugador);          
        mGraf = new MapaGrafico(coleccion);
        entorno = this;
        entidadesAAgregar = new LinkedList<Entidad>();    
	}	
	
	private GeneradorMapa generarMapa(int n) {
		String dir = "nivel" + n + ".txt"; 
        File nivel = new File(dir); 
        
        if( ! nivel.exists()) { 
        	GeneradorDeNiveles gen = new GeneradorDeNiveles();
        	dir ="nivel0.txt";
        	nivel = gen.getNivel();
        }
        
        return new GeneradorMapa(dir);
	}
	
	public MapaGrafico getMapaGrafico() {
		return mGraf;
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public Posicion getObjetivo() {
		return jugador.getPosicion();
	}
	
	public Collection<Entidad> getColeccion(){
		return coleccion;
	}
	
	public int getEnemigosRestantes() {
		return cantEnemigos;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public boolean termine() {		
		return !jugador.estaViva() || cantEnemigos==0;
	}

	public void agregarEntidad(Entidad e) {
		entidadesAAgregar.add(e);
	}
	
	public void agregarEntidadesPendientes() {
		for(Entidad e: entidadesAAgregar) {
			coleccion.add(e);
			mGraf.agregarGrafico(e.getGrafico());
		}
		entidadesAAgregar.clear();
	}
	
	public void remover(Entidad e1) {
		e1.morir();
		puntaje = puntaje + e1.getPuntaje();
		mGraf.removerGrafico(e1.getGrafico());
		coleccion.remove(e1);
	}
	
	public void reducirEnemigos() {
		cantEnemigos--;
	}
	
	public boolean colision(Entidad e1, Entidad e2) {
		boolean colision = controlarHitbox(e1, e2);
		if (colision) {
			e1.chocar(e2);
			e2.chocar(e1);
		}
		return colision;
	}
	
	private boolean controlarHitbox(Entidad e1, Entidad e2) {
		Posicion posicion1 = e1.getPosicion();
		Posicion posicion2 = e2.getPosicion();
		return perteneceAlCuadrado(posicion1.getX(),posicion1.getY(),posicion2)
				|| perteneceAlCuadrado(posicion1.getX() + posicion1.getAncho(),posicion1.getY(),posicion2)
				|| perteneceAlCuadrado(posicion1.getX(),posicion1.getY() + posicion1.getAlto(),posicion2)
				|| perteneceAlCuadrado(posicion1.getX() + posicion1.getAncho(),posicion1.getY() + posicion1.getAlto(),posicion2);
	} 
	
	private boolean perteneceAlCuadrado(int X, int Y, Posicion posicion) {
		return (X>= posicion.getX() 
				&& X<=posicion.getX()+posicion.getAncho()) 
				&& (Y>= posicion.getY() 
				&& Y<=posicion.getY()+posicion.getAlto() );
	} 

	public void afectar(Entidad e) {
		for(Entidad ent: coleccion) 
			ent.chocar(e);
	}
	
	public void serAfectado(Entidad e) {
		for(Entidad ent: coleccion) 
			e.chocar(ent);
	}
}