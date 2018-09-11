package enemigo;

import jugador.*;
import proyectil.*;

public class Alpha extends EnemigoKamikaze{
	
	private AlphaGrafico grafico;

	public Alpha (int X, int Y, int Nivel) {
		super(X, Y, 103, 193);
		velocidadDeMovimiento = 2*Nivel;
		vidaMaxima = 100*Nivel;
		dañoAtaque = 5*Nivel;
		dañoImpacto = dañoAtaque*10;
		grafico = new AlphaGrafico(X, Y, 103, 193, velocidadDeMovimiento);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
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
	
	public AlphaGrafico getAlphaGrafico() {
		return grafico;
	}
}
