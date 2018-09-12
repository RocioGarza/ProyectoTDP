package logica;

import java.io.File;
import java.util.Collection;

import elemento.Elemento;

public class Mapa {
	
	private Collection<Elemento> coleccion;
	private MapaGrafico mGraf;
	
	//x=1028
	//y=1024
	
	public Mapa (int n)
	{
		File nivel;
		String dir = this.getClass()+"nivel" + n + ".txt"; 
        nivel = new File(dir); 
        if(! nivel.exists()) { //Si el nivel no existe genera un nivel random
        	GeneradorDeNiveles gen = new GeneradorDeNiveles();
        	nivel= gen.getNivel();
        }
        
        GeneradorMapa gen = new GeneradorMapa(nivel);
        coleccion = gen.getColeccion();
        
        mGraf = new MapaGrafico(coleccion);
	}	
	
	public MapaGrafico getGrafico()
	{
		return mGraf;
	}

}
