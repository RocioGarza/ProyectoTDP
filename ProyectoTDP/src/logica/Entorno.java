package logica;

import entidad.Entidad;

public abstract class Entorno {

	protected static Entorno entorno;
	
	public static Entorno getEntorno() {
		return entorno;
	}
	
	public abstract void  agregarEntidad(Entidad e);
	
	public abstract void reducirEnemigos();
	
	public abstract void afectar(Entidad e);
	
	public abstract void serAfectado(Entidad e);
}
