package premio;


import entidad.Entidad;
import entidad.Posicion;


public class Pocion extends ObjetoPrecioso{

	private PocionGrafica grafico;
	
	public Pocion(int X, int Y) {
		super(X, Y, 59, 66);
		grafico = new PocionGrafica(pos);
	}

	public PocionGrafica getGrafico() {
		return grafico;
	}
	
	public void mover() {
		pos.moverY(velocidadDeMovimiento);
		if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
			vida--;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
