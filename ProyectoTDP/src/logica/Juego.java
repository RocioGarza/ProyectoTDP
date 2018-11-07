package logica;

import entidad.Posicion;
import jugador.Jugador;

public class Juego extends Thread{
	
	private Mapa mapa;
	private Jugador infoJugador;
	private int puntaje;
	private int nivelMax; //Solo se usa para los niveles correlativos Hay que guardar un objeto de tipo juego cuando termina de jugar
	private int nivelActual;
	
	public Juego() {
		nivelMax = 10; 
		infoJugador = new Jugador(Posicion.getXmax()/2,Posicion.getYmax()-(Jugador.getAlto()*3/2));
		nivelActual=1;
	}
	
	public Mapa crearMapa() {
		mapa = new Mapa(infoJugador,nivelActual);
		//nivelActual=nivelMax;
		return mapa;
	}
	
	public Mapa crearMapa(int n) {
		if (n>nivelMax)		 //no permite al usuario acceder a niveles que todavia no supero
			n = -1; 			//crea un nuevo nivel random
		mapa = new Mapa(infoJugador,n); 
		nivelActual=n;
		return mapa;
	}
	
	public Mapa getMapa()
	{
		return mapa;
	}
	
	public void jugar(AdministradorDeMovimiento admMov) {	
		
		admMov.start();
		try {
			admMov.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.nivelFinalizado();
	}

	public void nivelFinalizado()
	{		
		System.out.println("NIVEL FIN");
		if(mapa.getJugador().estaViva()) {
			//El jugador gano
			System.out.println("GANE");
			if (nivelActual==nivelMax) {
				nivelMax++;	
				nivelActual++;
			}
		} 
		puntaje = puntaje + mapa.finalizarMapa(); //DefinirFinalizacion del mapa
		infoJugador.revivir();
	}
}
