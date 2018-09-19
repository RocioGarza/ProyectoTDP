package enemigo;

import javax.swing.ImageIcon;
import entidad.EntidadGrafica;
import entidad.Posicion;

public class IotaGrafico extends EntidadGrafica {

	protected IotaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/IotaAtaque.gif"));
	}
}
