package colisionador;

import jugador.Jugador;
import premio.Congelador;

public class ColisionadorCongelarEnemigos extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		if(!Congelador.enEjecucion()) {
			Congelador congelador = new Congelador();
			Thread thread = new Thread(congelador);
			thread.start();
		}
	}
}
