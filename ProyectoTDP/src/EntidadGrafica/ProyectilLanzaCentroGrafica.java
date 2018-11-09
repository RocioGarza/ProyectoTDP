package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilLanzaCentroGrafica  extends ProyectilEnemigoGrafico{

	public ProyectilLanzaCentroGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaCentro.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaCentro.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaCentro.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaCentro.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaCentro.png"));
	}
}
