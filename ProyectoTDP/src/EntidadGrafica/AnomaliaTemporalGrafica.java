package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class AnomaliaTemporalGrafica extends EntidadGrafica{

	public AnomaliaTemporalGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal1.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal2.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal3.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal4.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/AnomaliaTemporal5.gif"));

	}
}
