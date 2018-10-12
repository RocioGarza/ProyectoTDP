package logica;

import java.io.File;
import java.util.Collection;

import javax.swing.JPanel;

import entidad.Entidad;
import entidad.Posicion;
import jugador.Jugador;

public class Mapa {
	
	private Collection<Entidad> coleccion;
	private MapaGrafico mGraf;
	private Jugador jugador;
	private int puntaje;
	
	public Mapa (Jugador j,int n){
		File nivel;
		String dir = this.getClass()+"nivel" + n + ".txt"; 
        nivel = new File(dir); 
        if(! nivel.exists()) { //Si el nivel no existe genera un nivel random
        	GeneradorDeNiveles gen = new GeneradorDeNiveles();
        	nivel= gen.getNivel();
        }
        
        
        String archivo ="nivel"+n+".txt";
        
        GeneradorMapa gen = new GeneradorMapa(archivo);
        coleccion = gen.getColeccion();
        
        jugador = j; 
        coleccion.add(jugador);
        
        puntaje = 0;
        
        mGraf = new MapaGrafico(coleccion);
	}	
	
	public MapaGrafico getMapaGrafico() {
		return mGraf;
	}
	
	public JPanel getGrafico(){
		return mGraf.getGrafica();
	}
	
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
	}
	
	private boolean perteneceAlCuadrado(int X, int Y, Posicion posicion) {
		return (X>= posicion.getX() 
				&& X<=posicion.getX()+posicion.getAncho()) 
				&& (Y>= posicion.getY() 
				&& Y<=posicion.getY()+posicion.getAlto() );
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public boolean termine() {
		return coleccion.size()==0 || !jugador.estaViva();
	}

	public int finalizarMapa() {
		return puntaje;
	}
}