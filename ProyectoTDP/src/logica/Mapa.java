package logica;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

import elemento.Elemento;
import jugador.Jugador;

public class Mapa {
	
	private Collection<Elemento> coleccion;
	private MapaGrafico mGraf;
	private Jugador j;
	
	//x=1028
	//y=1024
	
	public Mapa (int n){
		//j = new Jugador(512,300);
		File nivel;
		String dir = this.getClass()+"nivel" + n + ".txt"; 
        nivel = new File(dir); 
        if(! nivel.exists()) { //Si el nivel no existe genera un nivel random
        	GeneradorDeNiveles gen = new GeneradorDeNiveles();
        	nivel= gen.getNivel();
        }
        
        GeneradorMapa gen = new GeneradorMapa(nivel);
        coleccion = gen.getColeccion();
        
        coleccion.add(j);
        
        mGraf = new MapaGrafico(coleccion);
	}	
	
	public Mapa() {
		j = new Jugador(512,300);
		coleccion = new LinkedList<Elemento>();
		coleccion.add(j);
		mGraf = new MapaGrafico(coleccion);
	}
	
	public MapaGrafico getGrafico()
	{
		return mGraf;
	}
	
	public Jugador getJugador() {
		return j;
	}

}
