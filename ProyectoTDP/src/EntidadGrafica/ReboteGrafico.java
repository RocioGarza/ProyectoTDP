package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ReboteGrafico extends EntidadGrafica {

	public ReboteGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Rebote.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Rebote.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Rebote.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Rebote.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Rebote.png"));
	}
}
