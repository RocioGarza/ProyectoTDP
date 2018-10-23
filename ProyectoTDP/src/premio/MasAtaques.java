package premio;

import colisionador.ColisionadorMasAtaques;
import entidad.Entidad;
import entidad.Posicion;

public class MasAtaques extends ObjetoPrecioso{
	
	private MasAtaquesGrafico grafico;

	public MasAtaques(int X, int Y) {
		super(X, Y, 59, 66);
		puntaje = 10;
		grafico = new MasAtaquesGrafico(pos);
		colisionador = new ColisionadorMasAtaques();
	}

	@Override
	public MasAtaquesGrafico getGrafico() {
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
