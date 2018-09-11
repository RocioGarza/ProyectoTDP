package escudo;

import enemigo.EnemigoKamikaze;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze() {
		duracion = 1;
	}

	public int recibirDaño(EnemigoKamikaze e) {
		duracion = duracion - 1;
		return 0;
	}
}
