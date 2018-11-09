package logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import enemigo.Strelitzia;
import entidad.Entidad;
import entidad.Posicion;
import jugador.Jugador;

public class GeneradorMapa {
	
	private int x;
	private int y;
	private int yMax;
	private int xMax;
	BufferedReader arch;
	char puntero;
	private Collection<Entidad> coleccionEntidades;
	private int cantEnemigos;
	private AlmacenadorOcupados ocupados;
	Map<Character, GeneradorEntidades> mapeoGeneradores;
	
	public GeneradorMapa(String txt) {	 
		inicializarAtributos();
		abrirArchivo(txt);
		generarEntidades();
		cerrarArchivo();
	}
	
	private void inicializarAtributos() {
		x=0;
		y=50;
		puntero='.';
		yMax = (int) (Posicion.getYmax()-(Jugador.getAlto()*2.5))+y;
		xMax=Posicion.getXmax();
		coleccionEntidades = new LinkedList<Entidad>();
		cantEnemigos=0;
		ocupados = new AlmacenadorOcupados();
		mapeoGeneradores=crearMapeoGeneradores();
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
	}
	
	private void abrirArchivo(String txt) {
		try {
			arch =  new BufferedReader(new FileReader(txt));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void generarEntidades() {
		while(y<(yMax)) {
			avanzarASiguienteColumna();
			evaluarNivelStrelitzia();
			recorrerFila();
			x=0;
			y++;
		}
	}
	
	private void recorrerFila() {
		while(puntero!='/' && x!= xMax) {
			evaluarGenerarEntidad();
			avanzarASiguienteColumna();
		}
	}
	
	private void evaluarGenerarEntidad() {
		GeneradorEntidades generador = mapeoGeneradores.get(puntero); 
		if (generador != null) 
			generarEntidad(generador);
	}
	
	private void generarEntidad(GeneradorEntidades generador)	{
		Punto pos = definirPosicion(generador.getAlto(), generador.getAncho());
		if(pos != null) 
			crearEntidad(pos, generador);
	}
	
	private Punto definirPosicion(int alto, int ancho) {
		Punto pos = null;
		if (y+alto<yMax && x+ancho<xMax && !ocupados(x, ancho)) {
			ocuparArea(alto, ancho);
			pos = new Punto (x-ancho, y); 
		}
		return pos;
	}
	
	private boolean ocupados(int pos, int ancho) {
		boolean estaOcupado = false;
		for(int i = pos; i<pos+ancho && !estaOcupado; i++)
			estaOcupado = ocupados.estaOcupado(i,y);
		return estaOcupado;
	}
	
	private void ocuparArea(int alto, int ancho) {
		int xInicial = x;
		for(int i=xInicial; i<xInicial+ancho||puntero=='/'; i++) {
			ocuparColumna(i, alto);
			avanzarASiguienteColumna();
		}
	}
	
	private void ocuparColumna(int i, int alto) {
		for(int j=y; j<y+alto; j++)
			ocupados.add(i,j);
	}
	
	private void crearEntidad(Punto pos, GeneradorEntidades generador) {
		Entidad e = generador.crear(pos.getX(), pos.getY());
		coleccionEntidades.add(e);
		if (generador.generaEnemigo()) 
			cantEnemigos++;
	}
	
	private void avanzarASiguienteColumna() {
		x++;
		try {
			puntero = (char) arch.read();
		}  catch (IOException e) {
			puntero = '/';
		}	
	}

	private void evaluarNivelStrelitzia() {
		if(y==0 && puntero=='w') {
			generarNivelStrelitzia();
			y=yMax;
			x=xMax;
		}
	}
	
	private void generarNivelStrelitzia() {
		 coleccionEntidades.add(new Strelitzia(500,100));
		 cantEnemigos = 1;
	}
	
	private void cerrarArchivo() {
		try {
			arch.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}	
	
	public Collection<Entidad> getColeccion() {
		return coleccionEntidades;
	}
	
	public int getCantidadEnemigos() {
		return cantEnemigos;
	}
}