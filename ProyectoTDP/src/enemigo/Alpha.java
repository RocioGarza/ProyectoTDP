package enemigo;

import jugador.Jugador;
import proyectil.ProyectilJugador;

public class Alpha extends EnemigoKamikaze{
	
	private AlphaGrafico grafico;

	public Alpha (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 100;
		da�oAtaque = 5;
		da�oImpacto = da�oAtaque*10;
		grafico = new AlphaGrafico(pos);
	}
	
	public static int getAlto() {
		return 103; 
	}
	
	public static int getAncho() {
		return 193; 
	}

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
		this.quitarVida(e.getDa�o());
		if(this.vida == 0)
			this.morir();
	}
	
	public AlphaGrafico getGrafico() {
		return grafico;
	}
	
}
