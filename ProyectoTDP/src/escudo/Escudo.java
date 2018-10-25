package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDa�o(Proyectil e) {
		return e.getDa�o();
	}
	
	public int recibirDa�o(Enemigo e) {
		return e.getDa�o();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
