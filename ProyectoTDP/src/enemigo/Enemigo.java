package enemigo;

import entidad.Personaje;
import proyectil.ProyectilJugador;

public abstract class Enemigo extends Personaje {
	
	protected Inteligencia inteligencia; 
	
	public Enemigo (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
	}
	
	public int getDaño() {
		return dañoAtaque;
	}
	
	public void serColisionado(ProyectilJugador p) {
		vida=0;
	}
	
	public Inteligencia getInteligencia() {
		return inteligencia;
	}
	
	public abstract void atacar();
}
