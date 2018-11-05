package obstaculo;

import EntidadGrafica.PortalGrafico;
import colisionador.ColisionadorPortal;
import entidad.Entidad;

public class Portal extends Obstaculo{

	private PortalGrafico grafico;
	
	public Portal (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new PortalGrafico(pos);
		colisionador = new ColisionadorPortal();
	}
	
	public static int getAlto() {
		return 75;
	}
	
	public static int getAncho() {
		return 75;
	}
	
	public PortalGrafico getGrafico() {
		return grafico;
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void mover() {}
	
	public void morir() {}
}
