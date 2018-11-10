package colisionador;

import jugador.Jugador;
import escudo.EscudoAntiKamikaze;

public class ColisionadorEscudoKamikaze extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		e.setEscudo(new EscudoAntiKamikaze());
		
	}
}