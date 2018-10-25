package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

public class EscudoAntiKamikaze extends Escudo{
	
	public EscudoAntiKamikaze() {
		duracion = 1;
	}

	public int recibirDaño(Enemigo e) {
		if(duracion >= 1) {
			System.out.println("Duracion: "+duracion);
			duracion--;
			return 0;	
		}else
			return e.getDaño();
	}
	
	public int recibirDaño(Proyectil e) {
		return 0;
	}
}
