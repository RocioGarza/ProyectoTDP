package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilJugadorLaser extends ProyectilJugador{

	private ProyectilJugadorLaserGrafico grafico;

	public ProyectilJugadorLaser(int X, int Y, int da�o, int VM) {
		super(X,Y,32,8,da�o,VM);
		vida=1;
		grafico = new ProyectilJugadorLaserGrafico(pos);
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
