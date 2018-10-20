package premio;


import entidad.Entidad;
import entidad.EntidadGrafica;


public class Pocion extends ObjetoPrecioso{

	public Pocion(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntidadGrafica getGrafico() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void mover() {}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
