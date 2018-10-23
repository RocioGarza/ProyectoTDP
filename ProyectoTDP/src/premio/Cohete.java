package premio;

import colisionador.ColisionadorCohete;
import entidad.Entidad;
import entidad.Posicion;

public class Cohete extends ObjetoPrecioso{
	
	private CoheteGrafico grafico;

	public Cohete(int X, int Y) {
		super(X, Y, 59, 66);
		puntaje = 10;
		grafico = new CoheteGrafico(pos);
		colisionador = new ColisionadorCohete();
	}

	@Override
	public CoheteGrafico getGrafico() {
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
