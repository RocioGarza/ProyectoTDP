package escudo;

import enemigo.Enemigo;
import jugador.*;
import proyectil.Proyectil;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze(Jugador j) {
		jug = j;
		duracion = 1;
	}

	public int recibirDa�o(Enemigo e) {
		if(duracion == 1) {
			duracion--;
			cambiarEscudoTotal();
			return 0;	
		}else
			return e.getDa�o();
	}
	
	public int recibirDa�o(Proyectil e) {
		return e.getDa�o();
	}
	
	public void cambiarEscudoNormal() {
		jug.setEscudo(new EscudoNormal(jug));
	}
	
	public void cambiarEscudoTotal() {
		jug.setEscudo(new EscudoTotal(jug));
	}
	
	public void cambiarKamikaze() {}
}
