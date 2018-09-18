package enemigo;

import jugador.Jugador;
import proyectil.ProyectilJugador;
import elemento.*;

public class Alpha extends EnemigoKamikaze{
	
	private AlphaGrafico grafico;

	public Alpha (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 100;
		dañoAtaque = 5;
		dañoImpacto = dañoAtaque*10;
		grafico = new AlphaGrafico(X, Y, getAlto(), getAncho(), velocidadDeMovimiento);
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
	
	

	

	@Override
	public void mover(char c) {
		/*
		Hilo h = new Hilo();
		h.start();
		*/
	}
	
	protected void serColisionado(Jugador e) {
		this.morir();
	}
	
	protected void serColisionado(ProyectilJugador e) {
		this.quitarVida(e.getDaño());
		if(this.vida == 0)
			this.morir();
	}
	
	public AlphaGrafico getGrafico() {
		return grafico;
	}
	
}
