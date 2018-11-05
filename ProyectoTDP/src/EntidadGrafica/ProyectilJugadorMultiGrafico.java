package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;
import proyectil.ProyectilJugadorGrafico;

public class ProyectilJugadorMultiGrafico extends ProyectilJugadorGrafico{

	public ProyectilJugadorMultiGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
	}
}
