package colisionador;

import arma.ArmaJugadorMultiDisparo;
import jugador.Jugador;

public class ColisionadorMasAtaques extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		e.agregarArma(new ArmaJugadorMultiDisparo(e.getPosicion()));
	}
}
