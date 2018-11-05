package colisionador;

import enemigo.Alpha;
import enemigo.AnomaliaTemporal;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import enemigo.Strelitzia;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import proyectil.BuscadorObjetivo;
import proyectil.Proyectil;

public class ColisionadorProyectilJugador extends ColisionadorProyectil{
	
	public ColisionadorProyectilJugador(Proyectil p) {
		proyectil = p;
	}
	
	public void serChocado(Alpha e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(Beta e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(Gamma e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(Delta e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(Iota e) {
		e.quitarVida(proyectil.getDaño());
	}
	
	public void serChocado(Strelitzia e) {
		e.quitarVida(proyectil.getDaño());
	}
	
	public void serChocado(AnomaliaTemporal e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(Pared e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(ParedJugador e) {
		e.quitarVida(proyectil.getDaño());
	}
	
	public void serChocado(BuscadorObjetivo e) {}
}
