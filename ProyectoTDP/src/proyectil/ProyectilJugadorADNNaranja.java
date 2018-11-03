package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;

public class ProyectilJugadorADNNaranja extends ProyectilJugador{
	
	private ProyectilJugadorADNNaranjaGrafico grafico;
	private InteligenciaProyectil inteligencia;

	public ProyectilJugadorADNNaranja(int X, int Y, int da�o, int VM) {
		super(X,Y,16,16,da�o,VM);
		vida=1;
		grafico = new ProyectilJugadorADNNaranjaGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
		inteligencia = new InteligenciaADNNaranja(this);
	}

	public ProyectilJugadorADNNaranjaGrafico getGrafico() {
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

