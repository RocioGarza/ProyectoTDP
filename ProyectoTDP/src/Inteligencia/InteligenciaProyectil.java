package Inteligencia;

import proyectil.Proyectil;

public abstract class InteligenciaProyectil{

	protected Proyectil proyectil;
	
	public InteligenciaProyectil(Proyectil p) {
		proyectil=p;
	}
	
	public abstract void mover();
}
