package enemigo;

import proyectil.Proyectil;

public class Delta extends EnemigoArmado{
	
	private DeltaGrafico grafico;

	public Delta (int X, int Y, int Nivel) {
		super(X, Y, 103, 193);
		velocidadDeMovimiento = 2*Nivel;
		vidaMaxima = 100*Nivel;	
		dañoAtaque = 5*Nivel;
		grafico = new DeltaGrafico(X, Y, 103, 193, velocidadDeMovimiento);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	public void mover(char c) {
		//intel.mover();
	}
	
	protected void serColisionado(Proyectil e) {
		this.quitarVida(e.getDaño());
		if(this.vida == 0)
			this.morir();
	}
	
	public DeltaGrafico getAlphaGrafico() {
		return grafico;
	}

}
