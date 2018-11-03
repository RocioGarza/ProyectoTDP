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
		int mov = r.nextInt(500)-250; 
		e.getPosicion().moverX(mov);
		mov = -Math.abs(mov);
		e.getPosicion().moverY(mov-100);
	}
	
	public void serChocado(ProyectilEnemigo e) {
		int mov = r.nextInt(500)-250; 
		e.getPosicion().moverX(mov);
		mov = -Math.abs(mov);
		e.getPosicion().moverY(mov-100);
	}
}
