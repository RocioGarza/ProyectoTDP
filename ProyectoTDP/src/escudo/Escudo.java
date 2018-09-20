package escudo;

import enemigo.Enemigo;
import proyectil.ProyectilEnemigo;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDaño(ProyectilEnemigo e) {
		return e.getDaño();
	}
	
	public int recibirDaño(Enemigo e) {
		return e.getDaño();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
