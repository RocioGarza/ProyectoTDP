package proyectil;

import Visitor.Visitable;
import Visitor.Visitor;
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
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.OndaExpansiva;
import premio.Pocion;

public class ProyectilJugador extends Proyectil implements Visitor,Visitable{
	
	private ProyectilJugadorGrafico grafico;

	public ProyectilJugador(int X, int Y, int VM, int daño) {
		super(X,Y,VM,daño);
		vida=1;
		grafico = new ProyectilJugadorGrafico(pos);
	}

	public ProyectilJugadorGrafico getGrafico() {
		return grafico;
	}
	
	public void chocar(Visitor visitor) {
		visitor.serChocado(this);
	}
	
	public void serChocado(Alpha e) {
		e.quitarVida(10000);
	}

	public void serChocado(Beta e) {
		e.quitarVida(10000);
	}

	public void serChocado(Gamma e) {
		e.quitarVida(10000);
	}

	public void serChocado(Delta e) {
		e.quitarVida(10000);
	}

	public void serChocado(Iota e) {
		e.quitarVida(10000);
	}

	public void serChocado(Jugador e) {}

	public void serChocado(Irrompible e) {
		e.quitarVida(10000);
	}

	public void serChocado(Pared e) {
		e.quitarVida(10000);
	}

	public void serChocado(ParedJugador e) {
		e.quitarVida(10000);
	}

	public void serChocado(Portal e) {
		e.quitarVida(10000);
	}

	public void serChocado(Rebote e) {
		e.quitarVida(10000);
	}

	public void serChocado(CongelarEnemigos e) {}

	public void serChocado(EscudoKamikaze e) {}

	public void serChocado(MasAtaques e) {}

	public void serChocado(MejoraAtaque e) {}

	public void serChocado(OndaExpansiva e) {}

	public void serChocado(Pocion e) {}

	public void serChocado(ProyectilJugador e) {}

	public void serChocado(ProyectilEnemigo e) {}

}
