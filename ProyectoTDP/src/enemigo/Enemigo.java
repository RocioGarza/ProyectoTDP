package enemigo;

import entidad.Personaje;

public abstract class Enemigo extends Personaje {
	
	protected Inteligencia intel;
	
	public Enemigo (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int da�o, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, da�o, VA);	
	}

}
