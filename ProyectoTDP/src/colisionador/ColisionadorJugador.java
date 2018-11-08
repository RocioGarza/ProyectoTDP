package colisionador;

import enemigo.Alpha;
import enemigo.AnomaliaTemporal;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import enemigo.Strelitzia;
import jugador.Jugador;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import premio.Cohete;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.Pocion;
import proyectil.BuscadorObjetivo;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class ColisionadorJugador  extends Colisionador{
	
	public void serChocado(Alpha e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Beta e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Gamma e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Delta e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Iota e) {
		e.quitarVida(e.getVidaMaxima());
	}
	
	public void serChocado(AnomaliaTemporal e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Strelitzia e) {}
	
	public void serChocado(Jugador e) {}

	public void serChocado(Irrompible e) {}

	public void serChocado(Pared e) {}

	public void serChocado(ParedJugador e) {}

	public void serChocado(Portal e) {}

	public void serChocado(CongelarEnemigos e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(EscudoKamikaze e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(MasAtaques e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(MejoraAtaque e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Cohete e) {
		e.quitarVida(e.getVidaMaxima());
	}

	public void serChocado(Pocion e) {
		e.quitarVida(e.getVidaMaxima());
	}
	
	public void serChocado(ProyectilJugador e) {}
	
	public void serChocado(ProyectilEnemigo e) {
		e.quitarVida(e.getVidaMaxima());
	}
	
	public void serChocado(BuscadorObjetivo e) {}
}
