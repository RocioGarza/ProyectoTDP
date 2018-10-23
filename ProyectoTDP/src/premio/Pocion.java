package premio;


import colisionador.ColisionadorPocion;
import entidad.Entidad;
import entidad.Posicion;


public class Pocion extends ObjetoPrecioso{

	private PocionGrafica grafico;
	
	public Pocion(int X, int Y) {
		super(X, Y, 59, 66);
		puntaje = 10;
		grafico = new PocionGrafica(pos);
		colisionador=new ColisionadorPocion();
	}

	public PocionGrafica getGrafico() {
		return grafico;
	}
	
	public void mover() {
		if(pos.getY()+pos.getAlto() >= Posicion.getYmax()-100)
			vida--;
		else
			pos.moverY(velocidadDeMovimiento);
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
