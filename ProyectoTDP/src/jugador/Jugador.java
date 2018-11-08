package jugador;

import java.util.LinkedList;
import java.util.Queue;

import EntidadGrafica.JugadorGrafico;
import arma.ArmaJugador;
import arma.ArmaJugadorADN;
import arma.ArmaJugadorArcoiris;
import arma.ArmaJugadorBasicaLaser;
import arma.ArmaJugadorBasicaProyectil;
import arma.ArmaJugadorCohete;
import colisionador.ColisionadorJugador;
import entidad.Entidad;
import entidad.Personaje;
import escudo.*;

public class Jugador extends Personaje{

	private Queue<ArmaJugador>  armasJugador;
	private ArmaJugador arma;
	private Escudo escudo;
	private JugadorGrafico grafico;
	
	public Jugador(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		establecerParametros();
		crearArmas();
		escudo = new EscudoTotal(this);
		grafico = new JugadorGrafico(pos);	
		colisionador = new ColisionadorJugador();
	}
	
	private void establecerParametros()	{
		velocidadDeMovimiento = 5;
		velocidadDeAtaque = 5;
		vidaMaxima = 100;
		vida = vidaMaxima;
		dañoAtaque = 5;
	}
	
	private void crearArmas() {
		armasJugador = new LinkedList<ArmaJugador>();
		anadirArmas();
		arma = new ArmaJugadorBasicaProyectil(pos);
	}
	
	private void anadirArmas() {
		armasJugador.add(new ArmaJugadorBasicaLaser(pos));
		armasJugador.add(new ArmaJugadorCohete(pos));
		armasJugador.add(new ArmaJugadorADN(pos));
		armasJugador.add(new ArmaJugadorArcoiris(pos));
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
	
	public JugadorGrafico getGrafico() {
		return grafico;
	}

	public ArmaJugador getArma() {
		return arma;
	}
	
	public void setEscudo(Escudo e) {
		escudo = e;
	}
	
	public void morir() {
	}
	
	public void mover() {
	}
	
	public void moverIzquierda()	{
		pos.moverX(-velocidadDeMovimiento);
	}
	
	public void moverDerecha() {
		pos.moverX(velocidadDeMovimiento);
	}
	
	public void disparar() { 
		arma.disparar(dañoAtaque, velocidadDeAtaque);
	}
	
	public void agregarArma(ArmaJugador a) {
		armasJugador.add(a);
	}
	
	public void cambiarArma() {
		armasJugador.add(arma);
		arma = armasJugador.poll();
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void revivir()	{
		vida=vidaMaxima;	
	}
}
