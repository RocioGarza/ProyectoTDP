package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ParedGrafica extends EntidadGrafica {
	
	public ParedGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Pared.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Pared.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Pared.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Pared.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Pared.png"));
	}

}
