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

public class ColisionadorObstaculo extends Colisionador{
	
	public void serChocado(Alpha e) {
		e.getInteligencia().rebotar();
	}

	public void serChocado(Beta e) {
		e.getInteligencia().rebotar();
	}

	public void serChocado(Gamma e) {
		e.getInteligencia().rebotar();
	}

	public void serChocado(Delta e) {
		e.getInteligencia().rebotar();
	}

	public void serChocado(Iota e) {
		e.getInteligencia().rebotar();
	}
	
	public void serChocado(Strelitzia e) {}
	
	public void serChocado(AnomaliaTemporal e) {}

	public void serChocado(Jugador e) {}

	public void serChocado(Irrompible e) {}

	public void serChocado(Pared e) {}

	public void serChocado(ParedJugador e) {}

	public void serChocado(Portal e) {}

	public void serChocado(CongelarEnemigos e) {}

	public void serChocado(EscudoKamikaze e) {}

	public void serChocado(MasAtaques e) {}

	public void serChocado(MejoraAtaque e) {}

	public void serChocado(Cohete e) {}

	public void serChocado(Pocion e) {}
	
	public void serChocado(ProyectilJugador e) {
		e.quitarVida(e.getVidaMaxima());
	}
	
	public void serChocado(ProyectilEnemigo e) {
		e.quitarVida(e.getVidaMaxima());
	}
	
	public void serChocado(BuscadorObjetivo e) {}
}
