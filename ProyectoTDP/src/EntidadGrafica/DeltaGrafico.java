package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class DeltaGrafico extends EntidadGrafica {
	
	public DeltaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/EnemigoArmadoCongelado.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Delta.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/DeltaAtaque.gif"));

	}
}
