package enemigo;

import jugador.Jugador;
import proyectil.ProyectilJugador;

public class Beta extends EnemigoKamikaze{
	
	private BetaGrafico grafico;

	public Beta (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 100;
		dañoAtaque = 5;
		dañoImpacto = dañoAtaque*10;
		grafico = new BetaGrafico(pos);
	}
	
	public static int getAlto() {
		return 103;
	}
	
	public static int getAncho() {
		return 193;
	}
	
	@Override
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
	
	public BetaGrafico getGrafico() {
		return grafico;
	}

}
