package premio;

import javax.swing.ImageIcon;

import EntidadGrafica.EntidadGrafica;
import entidad.Posicion;

public class MasAtaquesGrafico extends EntidadGrafica{

	protected MasAtaquesGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/MasAtaques.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/MasAtaques.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/MasAtaques.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/MasAtaques.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/MasAtaques.gif"));
	}
}
