package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Beta extends EnemigoKamikaze{
	
	private BetaGrafico grafico;

	public Beta (int X, int Y, int Nivel) {
		super(X, Y, 103, 193);
		velocidadDeMovimiento = 2*Nivel;
		vidaMaxima = 100*Nivel;	
		da�oAtaque = 5*Nivel;
		da�oImpacto = da�oAtaque*10;
		grafico = new BetaGrafico(X, Y, 103, 193, velocidadDeMovimiento);
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
		this.quitarVida(e.getDa�o());
		if(this.vida == 0)
			this.morir();
	}
	
	public BetaGrafico getAlphaGrafico() {
		return grafico;
	}

}
