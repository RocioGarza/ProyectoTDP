package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilJugadorBasico extends ProyectilJugador{
	
	private ProyectilJugadorGrafico grafico;

	public ProyectilJugadorBasico(int X, int Y, int da�o, int VM) {
		super(X,Y,25,16,da�o,VM);
		vida=1;
		grafico = new ProyectilJugadorGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
	}

	public ProyectilJugadorGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		pos.moverY(-velocidadDeMovimiento);
		if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
			vida=0;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}

}
