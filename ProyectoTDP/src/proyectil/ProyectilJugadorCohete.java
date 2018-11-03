package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilJugadorCohete extends ProyectilJugador{
	
	private ProyectilJugadorGrafico grafico;
	private long tiempoDisparo;
	private long incrementarVel;
	private InteligenciaProyectil inteligencia;
	
	public ProyectilJugadorCohete(int X, int Y, int daño) {
		super(X,Y,64,24,daño*10,1);
		vida=1;
		grafico = new ProyectilJugadorCoheteGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
		inteligencia = new InteligenciaCohete(this);
	}

	public ProyectilJugadorGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		inteligencia.mover();
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}

}