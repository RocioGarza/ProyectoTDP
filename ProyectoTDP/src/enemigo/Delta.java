package enemigo;

import arma.Arma;
import arma.ArmaEnemigo;
import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import proyectil.Proyectil;

public class Delta extends EnemigoArmado{
	
	private DeltaGrafico grafico;
	private Arma arma;

	public Delta (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		velocidadDeAtaque = 5;
		vidaMaxima = 100;
		vida=vidaMaxima;
		dañoAtaque = 5;
		arma = new ArmaEnemigo(pos);
		inteligencia = new IA_Armado(this);
		grafico = new DeltaGrafico(pos);
		puntaje=20;
		colisionador = new ColisionadorEnemigos(this);
	}
	
	public static int getAlto() {
		return 103;
	}
	
	public static int getAncho() {
		return 193;
	}

	public Proyectil atacar() {
		grafico.changeIcon(' ');
		return arma.disparar(dañoAtaque, velocidadDeAtaque);
	}

	public Proyectil mover() {
		return inteligencia.mover();
	}	
	
	public DeltaGrafico getGrafico() {
		return grafico;
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
