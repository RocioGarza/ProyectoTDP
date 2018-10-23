package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilJugadorMulti extends ProyectilJugador{
	
	private ProyectilJugadorMultiGrafico grafico;
	
	public ProyectilJugadorMulti(int X, int Y, int daño, int VM) {
		super(X,Y,24,8,daño,VM);
		vida=1;
		grafico = new ProyectilJugadorMultiGrafico(pos);
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
