package premio;

import Visitor.Visitable;
import Visitor.Visitor;
import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import entidad.EntidadGrafica;
import jugador.Jugador;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class CongelarEnemigos extends MagiaTemporal implements Visitable{

	public CongelarEnemigos(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntidadGrafica getGrafico() {
		// TODO Auto-generated method stub
		return null;
	}

	public void serChocado(Alpha e) {}

	public void serChocado(Beta e) {}

	public void serChocado(Gamma e) {}

	public void serChocado(Delta e) {}

	public void serChocado(Iota e) {}

	public void serChocado(Jugador e) {}

	public void serChocado(Irrompible e) {}

	public void serChocado(Pared e) {}

	public void serChocado(ParedJugador e) {}

	public void serChocado(Portal e) {}

	public void serChocado(Rebote e) {}

	public void serChocado(CongelarEnemigos e) {}

	public void serChocado(EscudoKamikaze e) {}

	public void serChocado(MasAtaques e) {}

	public void serChocado(MejoraAtaque e) {}

	public void serChocado(OndaExpansiva e) {}

	public void serChocado(Pocion e) {}
	
	public void serChocado(ProyectilJugador e) {}
	
	public void serChocado(ProyectilEnemigo e) {}

}
