package escudo;

import enemigo.EnemigoKamikaze;
import jugador.Jugador;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze() {
		duracion = 1;
	}

	public int recibirDa�o(EnemigoKamikaze e) {
		duracion = duracion - 1;
		return 0;
	}
}
