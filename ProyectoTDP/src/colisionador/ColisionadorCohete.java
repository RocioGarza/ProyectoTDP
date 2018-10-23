package colisionador;

import arma.ArmaJugadorCohete;
import jugador.Jugador;

public class ColisionadorCohete extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		e.agregarArma(new ArmaJugadorCohete(e.getPosicion()));
	}
}
