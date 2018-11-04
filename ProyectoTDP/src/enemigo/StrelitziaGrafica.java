package enemigo;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class StrelitziaGrafica extends EntidadGrafica {

	protected StrelitziaGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/StrelitziaIdle.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/StrelitziaCongelada.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/StrelitziaMovimientoDerecha.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/StrelitziaMovimientoIzquierda.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/StrelitziaAtaque.gif"));

	}
}
