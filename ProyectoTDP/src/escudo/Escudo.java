package escudo;

import enemigo.EnemigoKamikaze;
import proyectil.ProyectilEnemigo;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDa�o(ProyectilEnemigo e) {
		return e.getDa�o();
	}
	
	public int recibirDa�o(EnemigoKamikaze e) {
		return e.getDa�oImpacto();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
