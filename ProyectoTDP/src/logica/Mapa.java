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
        
        for(Entidad e: coleccion)
        	System.out.println(e.getVida());
        
        j = new Jugador(Posicion.getXmax()/2,Posicion.getYmax()-(Jugador.getAlto()*7)/2);
        coleccion.add(j);
        
        mGraf = new MapaGrafico(coleccion);
	}	
	
	public MapaGrafico getMapaGrafico() {
		return mGraf;
	}
	
	public JPanel getGrafico()
	{
		return mGraf.getGrafica();
	}
	
	public Jugador getJugador() {
		return j;
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
		coleccion.remove(e1);
		mGraf.removerGrafico(e1.getGrafico());
	}
	
	private boolean controlarHitbox(Entidad e1, Entidad e2) {
		Posicion posicion1 = e1.getPosicion();
		Posicion posicion2 = e2.getPosicion();
		boolean retorno=false;
		
		retorno = (posicion1.getX()>= posicion2.getX() && posicion1.getX()<=posicion2.getX()+posicion2.getAncho()) && (posicion1.getY()>= posicion2.getY() && posicion1.getY()<=posicion2.getY()+posicion2.getAlto());
		if (!retorno)
			retorno = (posicion2.getX()>= posicion1.getX() && posicion2.getX()<=posicion1.getX()+posicion1.getAncho()) && (posicion2.getY()>= posicion1.getY() && posicion2.getY()<=posicion1.getY()+posicion1.getAlto());

		return retorno;
	}
}
