package obstaculo;

import colisionador.ColisionadorObstaculo;
import entidad.Entidad;

public class Irrompible extends Obstaculo{

	private IrrompibleGrafico grafico;
	
	public Irrompible (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new IrrompibleGrafico(pos);
		colisionador = new ColisionadorObstaculo();
	}
	
	public static int getAlto() {
		return 75;
	}
	
	public static int getAncho() {
		return 75;
	}
	
	public IrrompibleGrafico getGrafico() {
		return grafico;
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
