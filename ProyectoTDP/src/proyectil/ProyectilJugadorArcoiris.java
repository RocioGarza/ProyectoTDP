package proyectil;

import java.util.Random;

import EntidadGrafica.ProyectilJugadorArcoirisGrafico;
import Inteligencia.InteligenciaArcoiris;
import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;

public class ProyectilJugadorArcoiris extends ProyectilJugador{
	
	private ProyectilJugadorArcoirisGrafico grafico;
	private InteligenciaArcoiris inteligencia;

	public ProyectilJugadorArcoiris(int X, int Y, int daño, int VM) {
		super(X,Y,14,14,daño,VM);
		vida=1;
		grafico = new ProyectilJugadorArcoirisGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
		inteligencia = new InteligenciaArcoiris(this);
		establecerImagenRandom();
	}
	
	public void establecerImagenRandom() {
		grafico.getGrafico();
		Random r = new Random();
		int aux = r.nextInt(5);
		if(aux==0)
			grafico.changeIcon('w');
		else
			if(aux==1)
				grafico.changeIcon('a');
			else
				if(aux==2)
					grafico.changeIcon('s');
				else
					if(aux==3)
						grafico.changeIcon('d');
					else
						grafico.changeIcon(' ');
	}
	
	public void establecerObjetivo(Entidad e) {
		inteligencia.establecerObjetivo(e);
	}

	public ProyectilJugadorArcoirisGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		inteligencia.mover();
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}

}
