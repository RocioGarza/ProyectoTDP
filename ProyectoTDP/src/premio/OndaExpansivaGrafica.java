package premio;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class OndaExpansivaGrafica extends EntidadGrafica{

	protected OndaExpansivaGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/OndaExpansiva.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/OndaExpansiva.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/OndaExpansiva.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/OndaExpansiva.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/OndaExpansiva.gif"));
	}
}
