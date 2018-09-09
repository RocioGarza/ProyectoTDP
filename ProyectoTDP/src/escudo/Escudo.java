package escudo;

import enemigo.EnemigoKamikaze;
import jugador.Jugador;
import proyectil.ProyectilEnemigo;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDaño(Jugador j, ProyectilEnemigo e) {
		return e.getDaño();
	}
	
	public int recibirDaño(Jugador j, EnemigoKamikaze e) {
		return e.getDañoImpacto();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
