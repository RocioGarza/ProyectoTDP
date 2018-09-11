package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Gamma extends EnemigoKamikaze{

	private GammaGrafico grafico;

	public Gamma (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, daño, VA);	
		grafico = new GammaGrafico(X, Y, alto, ancho, VM);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

	public void mover(char c) {
		intel.mover();
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
