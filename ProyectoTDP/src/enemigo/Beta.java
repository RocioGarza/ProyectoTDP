package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Beta extends EnemigoKamikaze{
	
	private BetaGrafico grafico;

	public Beta (int X, int Y, int Nivel) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2*Nivel;
		vidaMaxima = 100*Nivel;
		dañoAtaque = 5*Nivel;
		dañoImpacto = dañoAtaque*10;
		grafico = new BetaGrafico(X, Y, getAlto(), getAncho(), velocidadDeMovimiento);
	}
	
	public static int getAlto() {
		return 103;
	}
	
	public static int getAncho() {
		return 193;
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
	
	public BetaGrafico getAlphaGrafico() {
		return grafico;
	}

}
