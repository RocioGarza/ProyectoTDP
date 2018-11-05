package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class GammaGrafico extends EntidadGrafica {

	public GammaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/EnemigoKamikazeCongelado.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Gamma.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/GammaAtaque.gif"));

	}
}
