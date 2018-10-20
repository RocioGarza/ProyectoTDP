package enemigo;

import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import proyectil.Proyectil;

public class Alpha extends EnemigoKamikaze{
	
	private AlphaGrafico grafico;

	public Alpha (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 10;
		vida=vidaMaxima;
		dañoAtaque = 25;
		dañoImpacto = dañoAtaque*10;
		inteligencia = new IA_Kamikaze(this);
		grafico = new AlphaGrafico(pos);
		puntaje=10;
		colisionador = new ColisionadorEnemigos(this);
	}
	
	public static int getAlto() {
		return 56; 
	}
	
	public static int getAncho() {
		return 134; 
	}

	public Proyectil atacar() {
		grafico.changeIcon(' ');
		inteligencia = new IA_KamikazeAtaque(this);
		return null;
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public void terminarAtaque() {
		grafico.changeIcon('w');
		inteligencia = new IA_Kamikaze(this);
	}
	
	public AlphaGrafico getGrafico() {
		return grafico;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
 