package enemigo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class DeltaGrafico extends EntidadGrafica {
	
	protected DeltaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/DeltaAtaque.gif"));

	}
}
