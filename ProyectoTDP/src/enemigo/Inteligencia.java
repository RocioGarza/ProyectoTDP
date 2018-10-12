package enemigo;

import java.util.Random;
import proyectil.Proyectil;

public abstract class Inteligencia {

	protected char direccion;
	protected Random r;
	
	public Inteligencia() {
		r = new Random();
		int aux = r.nextInt(100);
		if(aux<50)
			direccion='d';
		else
			direccion='a';
	}
	
	public abstract Proyectil mover();
	
	public void rebotar() {
		if (direccion=='d')
			direccion='a';
		else
			if(direccion=='a')
				direccion='d';
	}
}
