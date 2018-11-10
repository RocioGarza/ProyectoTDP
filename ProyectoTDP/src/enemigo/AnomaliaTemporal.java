package enemigo;

import java.util.Random;

import EntidadGrafica.AnomaliaTemporalGrafica;
import EntidadGrafica.EntidadGrafica;
import Inteligencia.IA_AnomaliaTemporal;
import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import entidad.Posicion;
import logica.Entorno;
import premio.Pocion;

public class AnomaliaTemporal extends Enemigo{

	private AnomaliaTemporalGrafica grafico;
	
	public AnomaliaTemporal(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 0;
		vidaMaxima = 500;
		vida=vidaMaxima;
		dañoAtaque = 250;
		grafico = new AnomaliaTemporalGrafica(pos);
		puntaje=10;
		colisionador = new ColisionadorEnemigos(this);
		inteligencia = new IA_AnomaliaTemporal(this);
	}

	public void atacar() {}
	
	public static int getAlto() {
		return 88; 
	}
	
	public static int getAncho() {
		return 88; 
	}

	public void mover() {
		inteligencia.mover();
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void morir() {
		Random r = new Random();
		if(r.nextInt(100)<25)
			Entorno.getEntorno().agregarEntidad(new Pocion(pos.getX(),pos.getY()));
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

}
