package enemigo;

import jugador.Jugador;
import proyectil.ProyectilJugador;

public class Gamma extends EnemigoKamikaze{

	private GammaGrafico grafico;

	public Gamma (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 100;
		dañoAtaque = 5;
		dañoImpacto = dañoAtaque*10;
		grafico = new GammaGrafico(pos);
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

	protected void serColisionado(Jugador e) {
		this.morir();
	}

	protected void serColisionado(ProyectilJugador e) {
		this.quitarVida(e.getDaño());
		if(this.vida == 0)
			this.morir();
	}

	public GammaGrafico getGrafico() {
		return grafico;
	}
}
