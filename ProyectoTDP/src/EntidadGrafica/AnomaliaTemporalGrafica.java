package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class AnomaliaTemporalGrafica extends EntidadGrafica{

	public AnomaliaTemporalGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal1.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal2.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal3.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal4.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal5.png"));

	}
}
