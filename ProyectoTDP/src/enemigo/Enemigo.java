package enemigo;

import entidad.Personaje;

public abstract class Enemigo extends Personaje {
	
	protected Inteligencia inteligencia; 
	
	public Enemigo (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
		inteligencia = new Inteligencia(this);
	}

}
