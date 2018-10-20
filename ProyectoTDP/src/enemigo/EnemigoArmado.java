package enemigo;

import arma.Arma;
import arma.ArmaEnemigo;
import proyectil.Proyectil;

public abstract class EnemigoArmado extends Enemigo{
	
	protected Arma arma;

	public EnemigoArmado (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
		arma = new ArmaEnemigo(pos);
	}
}
