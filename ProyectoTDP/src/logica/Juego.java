package logica;

import entidad.Posicion;
import jugador.Jugador;

public class Juego extends Thread{
	
	private Mapa mapa;
	private Jugador infoJugador;
	private int puntaje;
	private int nivel;
	
	public Juego() {
		nivel = 0;
		infoJugador = new Jugador(Posicion.getXmax()/2,Posicion.getYmax()-(Jugador.getAlto()*3/2));
	}
	
	public Mapa crearMapa() {
		mapa = new Mapa(infoJugador,nivel);
		return mapa;
	}
	
	public void jugar() {
		do {} while(!mapa.termine());
		if(!mapa.getJugador().estaViva()) {
			//El jugador perdio
		} else {
			puntaje = puntaje + mapa.finalizarMapa(); //DefinirFinalizacion del mapa
		}
	}

}
