package colisionador;

import java.util.Random;

import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import entidad.Entidad;
import entidad.Posicion;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class ColisionadorPortal extends ColisionadorObstaculo{
	
	private Random r;
	
	public ColisionadorPortal() {
		r= new Random();
	}
	
	public void serChocado(Alpha e) {
		transportarEnemigo(e);
	}

	public void serChocado(Beta e) {
		transportarEnemigo(e);
	}

	public void serChocado(Gamma e) {
		transportarEnemigo(e);
	}

	public void serChocado(Delta e) {
		transportarEnemigo(e);
	}

	public void serChocado(Iota e) {
		transportarEnemigo(e);
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
		e.getPosicion().moverY(100);
	}
	
	private void transportarEnemigo(Entidad e) {
		int mov = r.nextInt(Posicion.getXmax()/2)-(Posicion.getXmax()/4);
		e.getPosicion().moverX(mov);
		e.getPosicion().moverY(100);
	}
}
