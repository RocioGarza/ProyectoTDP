package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class PortalGrafico extends EntidadGrafica {

	public PortalGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Portal.gif"));
	}
}
