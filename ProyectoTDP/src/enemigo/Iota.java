package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Iota extends EnemigoArmado{

	private IotaGrafico grafico;

	public Iota (int X, int Y, int Nivel) {
		super(X, Y, 103, 193);
		velocidadDeMovimiento = 2*Nivel;
		vidaMaxima = 100*Nivel;	
		dañoAtaque = 5*Nivel;
		grafico = new IotaGrafico(X, Y, 103, 193, velocidadDeMovimiento);
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
	
	public IotaGrafico getAlphaGrafico() {
		return grafico;
	}
}
