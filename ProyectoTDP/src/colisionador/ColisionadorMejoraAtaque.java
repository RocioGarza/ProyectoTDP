package colisionador;

import jugador.Jugador;
import premio.BuffAtaque;

public class ColisionadorMejoraAtaque extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		BuffAtaque buff = new BuffAtaque(e);
		buff.start();
	}
}
