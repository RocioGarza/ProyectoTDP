package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

public class EscudoDisparos extends Escudo{
	
	public EscudoDisparos() {
		duracion = 5; //aguanta 5 disparos
	}
	
	public int recibirDa�o(Proyectil e) {
		duracion--;
		if(duracion > 0)
			return 0;
		else
			return e.getDa�o();
	}
	
	public int recibirDa�o(Enemigo e) {
		return e.getDa�o();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
