package enemigo;

import javax.swing.ImageIcon;
import entidad.EntidadGrafica;
import entidad.Posicion;

public class GammaGrafico extends EntidadGrafica {

	protected GammaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/GammaAtaque.gif"));
	}
}
