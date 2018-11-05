package obstaculo;

import EntidadGrafica.ReboteGrafico;
import colisionador.ColisionadorRebote;
import entidad.Entidad;

public class Rebote extends Obstaculo{

	private ReboteGrafico grafico;
	
	public Rebote (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ReboteGrafico(pos);
		colisionador = new ColisionadorRebote();
	}
	
	public static int getAlto() {
		return 126;
	}
	
	public static int getAncho() {
		return 126;
	}
	
	public ReboteGrafico getGrafico() {
		return grafico;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void mover() {}
	
	public void morir() {}
}
