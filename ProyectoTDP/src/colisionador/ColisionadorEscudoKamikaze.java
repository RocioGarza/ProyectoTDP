package colisionador;

import escudo.EscudoAntiKamikaze;
import jugador.Jugador;

public class ColisionadorEscudoKamikaze extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		e.getEscudo().cambiarKamikaze();
		
	}
}
