package obstaculo;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class PortalGrafico extends EntidadGrafica {

	protected PortalGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.png"));
	}
}
