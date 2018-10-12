package colisionador;

import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import obstaculo.Pared;
import obstaculo.ParedJugador;
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

	public void serChocado(Pared e) {
		e.quitarVida(proyectil.getDaño());
	}

	public void serChocado(ParedJugador e) {
		e.quitarVida(proyectil.getDaño());
	}
}
