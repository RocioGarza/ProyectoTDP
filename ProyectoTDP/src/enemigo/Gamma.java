package enemigo;

import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import jugador.Jugador;
import logica.Mapa;
import proyectil.Proyectil;

public class Gamma extends EnemigoKamikaze{

	private GammaGrafico grafico;

	public Gamma (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 50;
		vida=vidaMaxima;
		dañoAtaque = 25;
		dañoImpacto = dañoAtaque*10;
		inteligencia = new IA_Kamikaze(this);
		grafico = new GammaGrafico(pos);
		puntaje=25;
		colisionador = new ColisionadorEnemigos(this);
	}
	
	public static int getAlto() {
		return 56;
	}
	
	public static int getAncho() {
		return 134;
	}

	public void atacar() {
		grafico.changeIcon(' ');
		inteligencia = new IA_KamikazeAtaque(this);
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public void terminarAtaque() {
		grafico.changeIcon('w');
		inteligencia = new IA_Kamikaze(this);
	}

	public void serColisionado(Jugador e) {
		this.morir();
	}

	public GammaGrafico getGrafico() {
		return grafico;
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {
		Mapa.reducirEnemigos();
	}
}
