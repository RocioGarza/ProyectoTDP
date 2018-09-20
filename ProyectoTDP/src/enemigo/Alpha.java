package enemigo;

import entidad.Entidad;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;
import proyectil.ProyectilJugador;

public class Alpha extends EnemigoKamikaze{
	
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
	
	public AlphaGrafico getGrafico() {
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
