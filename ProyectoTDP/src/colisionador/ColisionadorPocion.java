package colisionador;

import jugador.Jugador;

public class ColisionadorPocion extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		e.curar(e.getVidaMaxima()/4);
	}
}
