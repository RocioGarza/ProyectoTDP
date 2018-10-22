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
		nivelMax = 0; 
		infoJugador = new Jugador(Posicion.getXmax()/2,Posicion.getYmax()-(Jugador.getAlto()*3/2));
		//nivelActual=0;
	}
	
	public Mapa crearMapa() {
		mapa = new Mapa(infoJugador,nivelMax);
		nivelActual=nivelMax;
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
	
	//public void jugar(Map<String,Character> mapeoInputs) {
	public void jugar(AdministradorDeMovimiento reloj) {	
		//if (this.mapa==null)
		// Tirar una MapaNOCreadoException (O CREAMOS DIRECTAMENTE EL MAPA ACA)	

		reloj.start();
		try {
			reloj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
			if (nivelActual==nivelMax)
				nivelMax++;
			puntaje = puntaje + mapa.finalizarMapa(); //DefinirFinalizacion del mapa
		} else {
			//El jugador perdio
		}
	}


}
