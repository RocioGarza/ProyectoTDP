package enemigo;

import Visitor.Visitable;
import Visitor.Visitor;
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
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class Alpha extends EnemigoKamikaze implements Visitor,Visitable{
	
	private AlphaGrafico grafico;

	public Alpha (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 100;
		dañoAtaque = 5;
		dañoImpacto = dañoAtaque*10;
		grafico = new AlphaGrafico(pos);
	}
	
	public static int getAlto() {
		return 103; 
	}
	
	public static int getAncho() {
		return 193; 
	}

	public void atacar() {
		grafico.changeIcon(' ');
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public void serColisionado(Jugador e) {
		this.morir();
	}
	
	public AlphaGrafico getGrafico() {
		return grafico;
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

	public void serChocado(Irrompible e) {
		inteligencia.rebotar();
	}

	public void serChocado(Pared e) {
		inteligencia.rebotar();
	}

	public void serChocado(ParedJugador e) {
		inteligencia.rebotar();
	}

	public void serChocado(Portal e) {
		inteligencia.rebotar();
	}

	public void serChocado(Rebote e) {
		inteligencia.rebotar();
	}

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
