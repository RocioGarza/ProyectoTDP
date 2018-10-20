package premio;

import colisionador.ColisionadorParedJugador;
import entidad.Entidad;

public abstract class Premio extends Entidad {

	public Premio(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
		vidaMaxima=1;
		vida=1;
		velocidadDeMovimiento=2;
		colisionador=new ColisionadorParedJugador();
	}

}
