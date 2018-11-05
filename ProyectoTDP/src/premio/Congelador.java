package premio;

import java.util.HashMap;
import java.util.Map;

import colisionador.Colisionador;
import colisionador.VisitorCongelador;
import colisionador.VisitorDescongelador;
import enemigo.Inteligencia;
import entidad.Entidad;
import entidad.EntidadGrafica;
import logica.Entorno;

public class Congelador extends Entidad implements Runnable{
	
	private Map<Entidad,Inteligencia> mapeoInteligencias;
	private Colisionador colisionador;
	private static boolean enEjecucion;
	
	public Congelador() {
		super(0, 0, 0, 0);
		mapeoInteligencias = new HashMap<Entidad,Inteligencia>();
		enEjecucion=true;
	}
	
	public static boolean enEjecucion() {
		return enEjecucion;
	}
	
	public void run() {
		colisionador = new VisitorCongelador(mapeoInteligencias);
		Entorno.getEntorno().afectar(this);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		colisionador = new VisitorDescongelador(mapeoInteligencias);
		Entorno.getEntorno().afectar(this);
		enEjecucion=false;
	}
	
	public Colisionador getColisionador() {
		return colisionador;
	}

	public void mover() {
		// TODO Auto-generated method stub
		
	}

	public EntidadGrafica getGrafico() {
		return null;
	}

	public void morir() {}

	public void chocar(Entidad e) {}
	
	
}
