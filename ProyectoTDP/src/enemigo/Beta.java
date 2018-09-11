package enemigo;

import jugador.Jugador;
import proyectil.Proyectil;

public class Beta extends EnemigoKamikaze{
	
	private BetaGrafico grafico;

	public Beta (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, daño, VA);	
		grafico = new BetaGrafico(X, Y, alto, ancho, VM);
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
	
	public BetaGrafico getAlphaGrafico() {
		return grafico;
	}

}
