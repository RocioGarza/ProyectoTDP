package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class IrrompibleGrafico extends EntidadGrafica {

	public IrrompibleGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Irrompible.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Irrompible.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Irrompible.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Irrompible.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Irrompible.gif"));
	}
}
