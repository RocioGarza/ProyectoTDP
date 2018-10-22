package premio;

import entidad.Entidad;
import entidad.Posicion;

public class MasAtaques extends ObjetoPrecioso{
	
	private MasAtaquesGrafico grafico;

	public MasAtaques(int X, int Y) {
		super(X, Y, 59, 66);
		grafico = new MasAtaquesGrafico(pos);
	}

	@Override
	public MasAtaquesGrafico getGrafico() {
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
