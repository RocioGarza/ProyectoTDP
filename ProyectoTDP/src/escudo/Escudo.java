package escudo;

import enemigo.EnemigoKamikaze;
import proyectil.ProyectilEnemigo;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDaño(ProyectilEnemigo e) {
		return e.getDaño();
	}
	
	public int recibirDaño(EnemigoKamikaze e) {
		return e.getDañoImpacto();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
