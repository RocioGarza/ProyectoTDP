package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;
import jugador.*;

public abstract class Escudo {
	
	protected int duracion;
	protected Jugador jug;
	
	public int recibirDa�o(Proyectil e) {
		return e.getDa�o();
	}
	
	public int recibirDa�o(Enemigo e) {
		return e.getDa�o();
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public abstract void cambiarEscudoNormal();
	
	public abstract void cambiarEscudoTotal();
	
	public abstract void cambiarKamikaze();
	
	
}
