package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;
import jugador.*;

public abstract class Escudo {
	
	protected int duracion;
	protected Jugador jug;
	
	public int recibirDaño(Proyectil e) {
		return e.getDaño();
	}
	
	public int recibirDaño(Enemigo e) {
		return e.getDaño();
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public abstract void cambiarEscudoNormal();
	
	public abstract void cambiarEscudoTotal();
	
	public abstract void cambiarKamikaze();
	
	
}
