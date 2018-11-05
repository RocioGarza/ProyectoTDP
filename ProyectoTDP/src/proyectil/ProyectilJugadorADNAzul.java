package proyectil;

import EntidadGrafica.ProyectilJugadorADNAzulGrafico;
import Inteligencia.InteligenciaADNAzul;
import Inteligencia.InteligenciaProyectil;
import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;

public class ProyectilJugadorADNAzul extends ProyectilJugador{
	
	private ProyectilJugadorADNAzulGrafico grafico;
	private InteligenciaProyectil inteligencia;

	public ProyectilJugadorADNAzul(int X, int Y, int daño, int VM) {
		super(X,Y,16,16,daño,VM);
		vida=1;
		grafico = new ProyectilJugadorADNAzulGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
		inteligencia = new InteligenciaADNAzul(this);
	}

	public ProyectilJugadorADNAzulGrafico getGrafico() {
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
