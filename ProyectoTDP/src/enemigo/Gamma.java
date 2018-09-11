package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Gamma extends EnemigoKamikaze{

	private GammaGrafico grafico;

	public Gamma (int X, int Y, int Nivel) {
		super(X, Y, 103, 193);
		velocidadDeMovimiento = 2*Nivel;
		vidaMaxima = 100*Nivel;	
		dañoAtaque = 5*Nivel;
		dañoImpacto = dañoAtaque*10;
		grafico = new GammaGrafico(X, Y, 103, 193, velocidadDeMovimiento);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

	public void mover(char c) {
		//intel.mover();
	}

	protected void serColisionado(Jugador e) {
		this.morir();
	}

	protected void serColisionado(Proyectil e) {
		this.quitarVida(e.getDaño());
		if(this.vida == 0)
			this.morir();
	}

	public GammaGrafico getAlphaGrafico() {
		return grafico;
	}
}
