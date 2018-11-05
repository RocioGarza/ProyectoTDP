package logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import entidad.Entidad;
import entidad.Posicion;
import jugador.Jugador;

public class GeneradorMapa {
	
	BufferedReader arch;
	private Collection<Entidad> coleccionEntidades;
	private int x;
	private int y;
	private int yMax;
	private int cantEnemigos;
	private char c;
	private AlmacenadorOcupados ocupados;
	
	public GeneradorMapa(String txt) {	 
		yMax = Posicion.getYmax()-(Jugador.getAlto()*2);
		coleccionEntidades = new LinkedList<Entidad>();
		ocupados = new AlmacenadorOcupados();
		cantEnemigos=0;
		generarEntidades(txt);
	}
	
	private void generarEntidades(String txt) {
		try {
			arch =  new BufferedReader(new FileReader(txt));
			x=0;
			y=0;
			Map<Character, GeneradorEntidades> mapeoGeneradores = crearMapeoGeneradores();
			while(y<(yMax)) {
				c =(char) arch.read();
				while(c!='/' && x!= Posicion.getXmax()) {
					GeneradorEntidades g = mapeoGeneradores.get(c); 
					if (g!= null) 
						crearEntidad(g);
					x++;
					c =(char) arch.read();
				}
				x=0;
				y++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Map<Character, GeneradorEntidades> crearMapeoGeneradores() {
		Map<Character, GeneradorEntidades> mapeoGeneradores = new HashMap<Character, GeneradorEntidades>();
		inicializarMapeoGeneradores(mapeoGeneradores);
		return mapeoGeneradores;
	}
	
	private void inicializarMapeoGeneradores(Map<Character, GeneradorEntidades> mapeoGeneradores) {
		mapeoGeneradores.put('A', new GeneradorAlpha());
		mapeoGeneradores.put('B', new GeneradorBeta());
		mapeoGeneradores.put('C', new GeneradorGamma());
		mapeoGeneradores.put('D', new GeneradorDelta());
		mapeoGeneradores.put('E', new GeneradorIota());
		mapeoGeneradores.put('1', new GeneradorIrromp());
		mapeoGeneradores.put('2', new GeneradorPared());
		mapeoGeneradores.put('3', new GeneradorParedJ());
		mapeoGeneradores.put('4', new GeneradorPortal());
		mapeoGeneradores.put('5', new GeneradorRebote());
	}
	
	private void crearEntidad(GeneradorEntidades generador)	{
		Punto pos = establecerPosicion(generador.getAlto(), generador.getAncho());
		if(pos != null) {
			Entidad e = generador.crear(pos.getX(), pos.getY());
			coleccionEntidades.add(e);
			if (generador.generaEnemigo()) 
				cantEnemigos++;
		}
	}
	
	private Punto establecerPosicion(int alto, int ancho)
	{
		Punto pos = null;
		if (y+alto<yMax && x+ancho<Posicion.getXmax() && !ocupados(x, ancho)) {
			char aux ='.';
			int xAux =x;
			for(int i=xAux; i<xAux+ancho||aux=='/'; i++) {
				ocuparColumna(i, alto);
				aux = avanzarASiguienteColumna();
			}
			pos = new Punto (x-ancho/2, y+alto/2); 
		}
		return pos;
	}
	
	private void ocuparColumna(int i, int alto) {
		for(int j=y; j<y+alto; j++)
			ocupados.add(i,j);
	}
	
	private char avanzarASiguienteColumna() {
		x++;
		char aux ='.';
		try {
			aux = (char) arch.read();
		}  catch (IOException e) {
			return '/';
		}	
		return aux;
	}
	
	private boolean ocupados(int pos, int ancho) {
		boolean estaOcupado = false;
		for(int i = pos; i<pos+ancho && !estaOcupado; i++)
			estaOcupado = ocupados.estaOcupado(i,y);
		return estaOcupado;
	}
	
	public Collection<Entidad> getColeccion() {
		return coleccionEntidades;
	}
	
	public int getCantidadEnemigos() {
		return cantEnemigos;
	}
}