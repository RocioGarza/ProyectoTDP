package enemigo;

import Inteligencia.InteligenciaEnemigo;
import entidad.Personaje;
import proyectil.ProyectilJugador;

public abstract class Enemigo extends Personaje {
	
	protected InteligenciaEnemigo inteligencia; 
	
	public Enemigo (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
	}
	
	public int getDaño() {
		return dañoAtaque;
	}
	
	public void serColisionado(ProyectilJugador p) {
		vida=0;
	}
	
	public InteligenciaEnemigo getInteligencia() {
		return inteligencia;
	}
	
	public void setInteligencia(InteligenciaEnemigo i) {
		inteligencia = i;
	}
	
	public abstract void atacar();
}
