package enemigo;

import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import entidad.EntidadGrafica;
import logica.Entorno;

public class Strelitzia extends Enemigo{
	
	private StrelitziaGrafica grafico;

	public Strelitzia(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		velocidadDeAtaque = 5;
		vidaMaxima = 2000;
		vida=vidaMaxima;
		dañoAtaque = 50;
		colisionador = new ColisionadorEnemigos(this);
		inteligencia = new InteligenciaStrelitzia(this);
		grafico = new StrelitziaGrafica(pos);
	}
	
	public static int getAlto() {
		return 140; 
	}
	
	public static int getAncho() {
		return 77; 
	}
	
	public void atacar() {
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public int getVelocidadDeAtaque() {
		return velocidadDeAtaque;
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	public void morir() {
		Entorno.getEntorno().reducirEnemigos();
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

}
