package colisionador;

import jugador.Jugador;
import premio.Congelador;

public class ColisionadorCongelarEnemigos extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		Congelador congelador = new Congelador();
		Thread thread = new Thread(congelador);
		thread.start();
	}
}
