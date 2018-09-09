package escudo;

import enemigo.EnemigoKamikaze;
import jugador.Jugador;

public class EscudoAntiKamikaze extends Escudo{

	public int recibirDaño(Jugador j, EnemigoKamikaze e) {
		j.setEscudo('n');
		return 0;
	}
}
