package jugador;

import java.util.LinkedList;
import java.util.Queue;

import arma.ArmaJugador;
import arma.ArmaJugadorADN;
import arma.ArmaJugadorBasicaLaser;
import arma.ArmaJugadorBasicaProyectil;
import arma.ArmaJugadorCohete;
import arma.ArmaJugadorMultiDisparo;
import colisionador.ColisionadorJugador;
import entidad.Entidad;
import entidad.Personaje;
import escudo.Escudo;
import escudo.EscudoNormal;

public class Jugador extends Personaje{

	private Queue<ArmaJugador>  armasJugador;
	private ArmaJugador arma;
	private Escudo escudo;
	private JugadorGrafico grafico;
	
	public Jugador(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 5;
		velocidadDeAtaque = 5;
		vidaMaxima = 100;
		vida = vidaMaxima;
		dañoAtaque = 5;
		armasJugador = new LinkedList<ArmaJugador>();
		armasJugador.add(new ArmaJugadorBasicaLaser(pos));
		armasJugador.add(new ArmaJugadorCohete(pos));
		armasJugador.add(new ArmaJugadorADN(pos));
		arma = new ArmaJugadorBasicaProyectil(pos);
		escudo = new EscudoNormal();
		grafico = new JugadorGrafico(pos);	
		colisionador = new ColisionadorJugador();
	}
	
	public static int getAlto() {
		return 157;
	}
	
	public static int getAncho() {
		return 188;
	}
	
	public int getDaño() {
		return dañoAtaque;
	}
	
	public Escudo getEscudo() {
		return escudo;
	}
	
	public void setEscudo(Escudo e) {
		//Requisito: c debe ser un caracter valido asociado a un escudo
		escudo = e;
	}
	
	public void morir() {
		//hacer algo
	}
	
	public void mover() {}
	
	public void mover(char c) {
		if (c=='a')
			pos.moverX(-velocidadDeMovimiento);
		else
			if (c=='d')
				pos.moverX(velocidadDeMovimiento);
	}
	
	public void disparar(char c) {
		if (c==' ') 
			arma.disparar(dañoAtaque, velocidadDeAtaque);
	}
	
	public void cambiarArma() {
		armasJugador.add(arma);
		
		arma = armasJugador.poll();
	}
	
	/*private void controlarEscudo() {
		if (escudo.getDuracion()==0)
			escudo = new EscudoNormal();
	}*/
	
	public JugadorGrafico getGrafico() {
		return grafico;
	}

	public ArmaJugador getArma() {
		return arma;
	}
	
	public void agregarArma(ArmaJugador a) {
		armasJugador.add(a);
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
