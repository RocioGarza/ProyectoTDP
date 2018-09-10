package obstaculo;

import javax.swing.ImageIcon;
import elemento.ElementoGrafico;

public class PortalGrafico extends ElementoGrafico {

	protected PortalGrafico(int X, int Y, int alto, int ancho, int velocidad) {
		super(X, Y, alto, ancho, velocidad);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Portal/Portal.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Portal/Portal.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Portal/Portal.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Portal/Portal.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Portal/Portal.png"));
	}
}
