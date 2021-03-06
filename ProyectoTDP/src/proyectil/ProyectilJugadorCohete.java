package proyectil;

import EntidadGrafica.ProyectilJugadorCoheteGrafico;
import Inteligencia.InteligenciaCohete;
import Inteligencia.InteligenciaProyectil;
import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;

public class ProyectilJugadorCohete extends ProyectilJugador{
	
	private ProyectilJugadorGrafico grafico;
	private InteligenciaProyectil inteligencia;
	
	public ProyectilJugadorCohete(int X, int Y, int da�o) {
		super(X,Y,64,24,da�o*10,1);
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