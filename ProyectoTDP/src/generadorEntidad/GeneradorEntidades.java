package generadorEntidad;

import entidad.Entidad;

public abstract class GeneradorEntidades {
	public abstract Entidad crear(int x, int y);
	public abstract int getAlto();
	public abstract int getAncho();
	public abstract boolean generaEnemigo();
}
