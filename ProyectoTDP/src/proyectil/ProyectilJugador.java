package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilJugador extends Proyectil{
	
	private ProyectilJugadorGrafico grafico;

	public ProyectilJugador(int X, int Y, int VM, int daño) {
		super(X,Y,VM,daño);
		vida=1;
		grafico = new ProyectilJugadorGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
	}

	public ProyectilJugadorGrafico getGrafico() {
		return grafico;
	}
	
	public Proyectil mover() {
		pos.moverY(-velocidadDeMovimiento);
		if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
			vida=0;
		return null;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

}
