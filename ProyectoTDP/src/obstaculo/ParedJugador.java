package obstaculo;

import EntidadGrafica.ParedJugadorGrafica;
import colisionador.ColisionadorParedJugador;
import entidad.Entidad;

public class ParedJugador extends Obstaculo{
	
	private ParedJugadorGrafica grafico;
	
	public ParedJugador (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ParedJugadorGrafica(pos);
		colisionador = new ColisionadorParedJugador();
	}
	
	public static int getAlto() {
		return 126;
	}
	
	public static int getAncho() {
		return 126;
	}
	
	public ParedJugadorGrafica getGrafico() {
		return grafico;
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void mover() {}
	
	public void morir() {}
}
