package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze() {
		duracion = 1;
	}

	public int recibirDa�o(Enemigo e) {
		if(duracion == 1) {
			duracion--;
			return 0;	
		}else
			return e.getDa�o();
	}
	
	public int recibirDa�o(Proyectil e) {
		return e.getDa�o();
	}
}
