package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

public class EscudoDisparos extends Escudo{
	
	public EscudoDisparos() {
		duracion = 5; //aguanta 5 disparos
	}
	
	public int recibirDaño(Proyectil e) {
		duracion--;
		if(duracion > 0)
			return 0;
		else
			return e.getDaño();
	}
	
	public int recibirDaño(Enemigo e) {
		return e.getDaño();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
