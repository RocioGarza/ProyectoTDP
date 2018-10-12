package premio;

import entidad.Entidad;
import entidad.EntidadGrafica;

public class MejoraAtaque extends MagiaTemporal{

	public MejoraAtaque(int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntidadGrafica getGrafico() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
