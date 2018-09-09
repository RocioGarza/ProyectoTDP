package escudo;

import enemigo.EnemigoKamikaze;
import jugador.Jugador;
import proyectil.ProyectilEnemigo;

public abstract class Escudo {
	
	protected int duracion;

	public int recibirDa�o(Jugador j, ProyectilEnemigo e) {
		return e.getDa�o();
	}
	
	public int recibirDa�o(Jugador j, EnemigoKamikaze e) {
		return e.getDa�oImpacto();
	}
	
	public int getDuracion() {
		return duracion;
	}
}
