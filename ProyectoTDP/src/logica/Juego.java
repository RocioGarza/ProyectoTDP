package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import entidad.Posicion;
import jugador.Jugador;

public class Juego implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private Mapa mapa;
	private Jugador infoJugador;
	private int puntaje;
	private int nivelMax; 
	private int nivelActual;
	
	public Juego() {
		nivelMax = 1; 
		infoJugador = new Jugador(Posicion.getXmax()/2,Posicion.getYmax()-(Jugador.getAlto()*3/2));
		nivelActual=1;
	}
	
	public Mapa crearMapa() {
		mapa = new Mapa(infoJugador,nivelActual);
		return mapa;
	}
	
	public Mapa crearMapa(int n) {
		if (n>nivelMax)		
			n = -1; 			
		mapa = new Mapa(infoJugador,n); 
		nivelActual=n;
		return mapa;
	}
	
	public Mapa getMapa()	{
		return mapa;
	}
	
	public void jugar(AdministradorDeMovimiento admMov) {	
		iniciarAdmMovimiento(admMov);
		finalizarNivel();
	}
	
	private void iniciarAdmMovimiento(AdministradorDeMovimiento admMov) {
		admMov.start();
		try {
			admMov.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void finalizarNivel() {		
		if(mapa.getJugador().estaViva()) 
			ganarNivel();
		puntaje = puntaje + mapa.getPuntaje(); 
		infoJugador.revivir();
	}
	
	private void ganarNivel()	{
		if (nivelActual==nivelMax) {
			nivelMax++;	
			nivelActual++;
		}
	}
	
	public void guardarJuego() {
		try {
			BufferedWriter arch = new BufferedWriter(new FileWriter("Juego.txt"));
			arch.write(nivelMax+" "+nivelActual+" "+puntaje);
			arch.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public void recuperarJuego() {
		try {	
			BufferedReader arch = new BufferedReader(new FileReader("Juego.txt"));
			nivelMax = (int) arch.read();
			arch.read();
			nivelActual = (int) arch.read();
			arch.read();
			puntaje = (int) arch.read();
			arch.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}