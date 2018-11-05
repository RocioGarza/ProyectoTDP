package colisionador;

import enemigo.Alpha;
import enemigo.AnomaliaTemporal;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Enemigo;
import enemigo.Gamma;
import enemigo.Iota;
import enemigo.Strelitzia;
import escudo.EscudoNormal;
import jugador.Jugador;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;
import premio.Cohete;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.Pocion;
import proyectil.BuscadorObjetivo;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class ColisionadorEnemigos extends Colisionador {
	
	Enemigo enemigo;
	
	public ColisionadorEnemigos(Enemigo e) {
		enemigo=e;
	}
	
	public void serChocado(Alpha e) {}

	public void serChocado(Beta e) {}

	public void serChocado(Gamma e) {}

	public void serChocado(Delta e) {}

	public void serChocado(Iota e) {}

	public void serChocado(Strelitzia e) {}
	
	public void serChocado(AnomaliaTemporal e) {}
	
	public void serChocado(Jugador e) {
		int n = e.getEscudo().recibirDaño(enemigo); // el escudo determina si absorber el impacto o pasarlo al jugador
		if(n > 0)
			e.setEscudo(new EscudoNormal());
		e.quitarVida(n);
	}

	public void serChocado(Irrompible e) {}

	public void serChocado(Pared e) {}

	public void serChocado(ParedJugador e) {}

	public void serChocado(Portal e) {}

	public void serChocado(Rebote e) {}

	public void serChocado(CongelarEnemigos e) {}

	public void serChocado(EscudoKamikaze e) {}

	public void serChocado(MasAtaques e) {}

	public void serChocado(MejoraAtaque e) {}

	public void serChocado(Cohete e) {}

	public void serChocado(Pocion e) {}
	
	public void serChocado(ProyectilJugador e) {
		e.quitarVida(e.getVidaMaxima());
	}
	
	public void serChocado(ProyectilEnemigo e) {}

	public void serChocado(BuscadorObjetivo e) {
		e.establecerObjetivo(enemigo);
	}
}
