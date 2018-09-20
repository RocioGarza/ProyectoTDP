package obstaculo;

import Visitor.Visitable;
import Visitor.Visitor;
import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import jugador.Jugador;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.OndaExpansiva;
import premio.Pocion;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class Pared extends Obstaculo implements Visitor,Visitable {

	private ParedGrafica grafico;
	
	public Pared (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ParedGrafica(pos);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public ParedGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	public void chocar(Visitor visitor) {
		visitor.serChocado(this);
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
	
	public void serChocado(ProyectilJugador e) {
		e.quitarVida(10);
	}
	
	public void serChocado(ProyectilEnemigo e) {}
}
