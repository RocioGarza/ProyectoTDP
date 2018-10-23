package premio;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class CoheteGrafico extends EntidadGrafica{

	protected CoheteGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete.gif"));
	}
}
