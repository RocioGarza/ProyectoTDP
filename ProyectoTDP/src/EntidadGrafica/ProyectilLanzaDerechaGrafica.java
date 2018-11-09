package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilLanzaDerechaGrafica  extends ProyectilEnemigoGrafico{

	public ProyectilLanzaDerechaGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaDerecha.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaDerecha.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaDerecha.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaDerecha.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaDerecha.png"));
	}
}
