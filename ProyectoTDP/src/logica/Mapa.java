package logica;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JPanel;

import elemento.Elemento;
import elemento.PosicionMaxima;
import jugador.Jugador;

public class Mapa {
	
	private Collection<Elemento> coleccion;
	private MapaGrafico mGraf;
	private Jugador j;
	
	public Mapa (int n){
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
        
        j = new Jugador(PosicionMaxima.getX()/2,PosicionMaxima.getY()-(Jugador.getAlto()*7)/2);
        coleccion.add(j);
        
        mGraf = new MapaGrafico(coleccion);
	}	
	
	public Mapa() {
		j = new Jugador(PosicionMaxima.getX()/2,PosicionMaxima.getY()-(Jugador.getAlto()*7)/2);
		coleccion = new LinkedList<Elemento>();
		coleccion.add(j);
		mGraf = new MapaGrafico(coleccion);
	}
	
	public JPanel getGrafico()
	{
		return mGraf.getGrafica();
	}
	
	public Jugador getJugador() {
		return j;
	}

}
