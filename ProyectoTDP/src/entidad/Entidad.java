package entidad;

import EntidadGrafica.EntidadGrafica;
import colisionador.Colisionador;

public abstract class Entidad {

	protected int velocidadDeMovimiento;
	protected Posicion pos;
	protected int vidaMaxima;
	protected int vida;
	protected int puntaje;
	protected Colisionador colisionador;
	
	public Entidad(int X, int Y, int alto, int ancho) {
		pos = new Posicion(X,Y,alto,ancho);
		vidaMaxima=50;
		vida=vidaMaxima;
		puntaje=0;
	}
	
	public Posicion getPosicion() {
		return pos;
	}
	
	public int getVelocidadDeMovimiento() {
		return velocidadDeMovimiento;
	}
	
	public abstract void mover();

	public abstract EntidadGrafica getGrafico();
	
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void recargarVida() {
		vida = vidaMaxima;
	}
	
	public void quitarVida(int v) {
		if (vida-v<0)
			vida = 0;
		else
			vida = vida - v;
	}
	
	public void curar(int v) {
		if (vida+v>vidaMaxima)
			vida = vidaMaxima;
		else
			vida = vida + v;
	}
	
	public abstract void morir();
	
	public void aumentarVelocidadDeMovimiento(int vel) {
		velocidadDeMovimiento = velocidadDeMovimiento + vel;
	}
	
	public void quitarVelocidadDeMovimiento(int vel) {
		if (velocidadDeMovimiento-vel<0)
			velocidadDeMovimiento = 0;
		else
			velocidadDeMovimiento = velocidadDeMovimiento - vel;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public boolean estaViva() {
		return vida>0;
	}
	
	public Colisionador getColisionador() {
		return colisionador;
	}
	
	public abstract void chocar(Entidad e);
}
