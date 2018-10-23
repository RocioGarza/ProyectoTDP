package premio;

import entidad.Entidad;

public abstract class Premio extends Entidad {

	public Premio(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
		vidaMaxima=250;
		vida=vidaMaxima;
		velocidadDeMovimiento=2;
	}

}
