package escudo;

import enemigo.Enemigo;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze() {
		duracion = 1;
	}

	public int recibirDa�o(Enemigo e) {
		duracion = duracion - 1;
		return 0;
	}
}
