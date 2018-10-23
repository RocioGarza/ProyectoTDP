package colisionador;

import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
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
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public abstract class Colisionador {

	public abstract void serChocado(Alpha e);

	public abstract void serChocado(Beta e);

	public abstract void serChocado(Gamma e);

	public abstract void serChocado(Delta e);

	public abstract void serChocado(Iota e);

	public abstract void serChocado(Jugador e);

	public abstract void serChocado(Irrompible e);

	public abstract void serChocado(Pared e);

	public abstract void serChocado(ParedJugador e);

	public abstract void serChocado(Portal e);

	public abstract void serChocado(Rebote e);

	public abstract void serChocado(CongelarEnemigos e);

	public abstract void serChocado(EscudoKamikaze e);

	public abstract void serChocado(MasAtaques e);

	public abstract void serChocado(MejoraAtaque e);

	public abstract void serChocado(Cohete e);

	public abstract void serChocado(Pocion e);
	
	public abstract void serChocado(ProyectilJugador e);
	
	public abstract void serChocado(ProyectilEnemigo e);
}
