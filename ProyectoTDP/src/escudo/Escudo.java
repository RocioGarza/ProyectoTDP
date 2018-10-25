package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDaño(Proyectil e) {
		return e.getDaño();
	}
	
	public int recibirDaño(Enemigo e) {
		return e.getDaño();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
