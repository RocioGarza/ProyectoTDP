package premio;

import javax.swing.ImageIcon;

import EntidadGrafica.EntidadGrafica;
import entidad.Posicion;

public class CongelarEnemigosGrafico extends EntidadGrafica{

	protected CongelarEnemigosGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/CongelarEnemigos.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/CongelarEnemigos.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/CongelarEnemigos.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/CongelarEnemigos.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/CongelarEnemigos.gif"));
	}
}
