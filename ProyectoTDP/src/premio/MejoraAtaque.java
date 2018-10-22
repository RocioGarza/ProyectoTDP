package premio;

import entidad.Entidad;
import entidad.Posicion;

public class MejoraAtaque extends MagiaTemporal{
	
	private MejoraAtaqueGrafica grafico;

	public MejoraAtaque(int X, int Y) {
		super(X, Y, 59, 66);
		grafico = new MejoraAtaqueGrafica(pos);
	}

	@Override
	public MejoraAtaqueGrafica getGrafico() {
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
