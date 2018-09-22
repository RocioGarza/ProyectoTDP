package enemigo;

import entidad.Entidad;
import jugador.Jugador;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;
import proyectil.ProyectilJugador;

public class Gamma extends EnemigoKamikaze{

	private GammaGrafico grafico;

	public Gamma (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 100;
		da�oAtaque = 5;
		da�oImpacto = da�oAtaque*10;
		grafico = new GammaGrafico(pos);
		puntaje=25;
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

	public GammaGrafico getGrafico() {
		return grafico;
	}

	//Colisiones

		public void chocar(Entidad e) {
			e.serChocado(this);
		}
		
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
		
		public void serChocado(ProyectilJugador e) {
			e.quitarVida(10);
		}
}
