package premio;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class PocionGrafica extends EntidadGrafica{

	protected PocionGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Pocion.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Pocion.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Pocion.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Pocion.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Pocion.gif"));
	}
}
