package logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		nivelMax = 11; 
		infoJugador = new Jugador(Posicion.getXmax()/2,Posicion.getYmax()-(Jugador.getAlto()*3/2));
		nivelActual=11;
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
			File arch = new File("Juego.dat");
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(arch));
			output.writeObject(this);
			output.flush();
			output.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void recuperarJuego() {
		Juego j;
		try {	
			File arch = new File("Juego.dat"); 
			ObjectInputStream input = new ObjectInputStream( new FileInputStream(arch) );
			j = (Juego) input.readObject();
			input.close(); 
		}catch(IOException | ClassNotFoundException e) {
			j=new Juego();
		}
		this.infoJugador = j.infoJugador;
		this.nivelMax=j.nivelMax;
		this.nivelActual=j.nivelActual;
		this.puntaje=j.puntaje;
	}
}