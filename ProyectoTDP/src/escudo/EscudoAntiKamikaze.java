package escudo;

import enemigo.Enemigo;
import jugador.*;
import proyectil.Proyectil;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze(Jugador j) {
		jug = j;
		duracion = 1;
	}

	public int recibirDaño(Enemigo e) {
		if(duracion == 1) {
			duracion--;
			cambiarEscudoTotal();
			return 0;	
		}else
			return e.getDaño();
	}
	
	public int recibirDaño(Proyectil e) {
		return e.getDaño();
	}
	
	public void cambiarEscudoNormal() {
		jug.setEscudo(new EscudoNormal(jug));
	}
	
	public void cambiarEscudoTotal() {
		jug.setEscudo(new EscudoTotal(jug));
	}
	
	public void cambiarKamikaze() {}
}
