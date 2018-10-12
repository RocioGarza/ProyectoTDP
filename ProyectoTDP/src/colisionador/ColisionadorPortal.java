package colisionador;

import java.util.Random;

import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class ColisionadorPortal extends ColisionadorObstaculo{
	
	private Random r;
	
	public ColisionadorPortal() {
		r= new Random();
	}

	public void serChocado(ProyectilJugador e) {
		e.getPosicion().moverX(r.nextInt(500)-250);;
		e.getPosicion().moverY(-100);
	}
	
	public void serChocado(ProyectilEnemigo e) {
		e.getPosicion().moverX(r.nextInt(500)-250);;
		e.getPosicion().moverY(100);
	}
}
