package obstaculo;

import colisionador.ColisionadorObstaculo;
import entidad.Entidad;

public class Pared extends Obstaculo{

	private ParedGrafica grafico;
	
	public Pared (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ParedGrafica(pos);
		colisionador = new ColisionadorObstaculo();
	}
	
	public static int getAlto() {
		return 126;
	}
	
	public static int getAncho() {
		return 126;
	}
	
	public ParedGrafica getGrafico() {
		return grafico;
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void mover() {}
}
