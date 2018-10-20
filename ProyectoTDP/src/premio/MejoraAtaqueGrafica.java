package premio;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class MejoraAtaqueGrafica extends EntidadGrafica{

	protected MejoraAtaqueGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/MejoraAtaque.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/MejoraAtaque.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/MejoraAtaque.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/MejoraAtaque.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/MejoraAtaque.gif"));
	}
}
