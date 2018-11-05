package Inteligencia;

import java.util.Random;

public abstract class InteligenciaEnemigo {

	protected char direccion;
	protected Random r;
	
	public InteligenciaEnemigo() {
		r = new Random();
		int aux = r.nextInt(100);
		if(aux<50)
			direccion='d';
		else
			direccion='a';
	}
	
	public abstract void mover();
	
	public void rebotar() {
		if (direccion=='d')
			direccion='a';
		else
			if(direccion=='a')
				direccion='d';
	}
}
