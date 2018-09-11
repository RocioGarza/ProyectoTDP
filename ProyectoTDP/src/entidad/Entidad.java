package entidad;

import elemento.Elemento;

public abstract class Entidad extends Elemento {

	protected int vidaMaxima;
	protected int vida;
	
	public Entidad(int X, int Y, int alto, int ancho) {
		super(X,Y,alto,ancho);
	}
	
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
	
	protected void morir() {
		//hacer
	}
	
	public void aumentarVelocidadDeMovimiento(int vel) {
		velocidadDeMovimiento = velocidadDeMovimiento + vel;
	}
	
	public void quitarVelocidadDeMovimiento(int vel) {
		if (velocidadDeMovimiento-vel<0)
			velocidadDeMovimiento = 0;
		else
			velocidadDeMovimiento = velocidadDeMovimiento - vel;
	}
}
