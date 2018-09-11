package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Delta extends EnemigoArmado{
	
	private DeltaGrafico grafico;

	public Delta (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, daño, VA);	
		grafico = new DeltaGrafico(X, Y, alto, ancho, VM);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	public void mover(char c) {
		intel.mover();
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
