package enemigo;

import entidad.Personaje;

public abstract class Enemigo extends Personaje {
	
	//protected Inteligencia intel;
	
	public Enemigo (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
	}

}
