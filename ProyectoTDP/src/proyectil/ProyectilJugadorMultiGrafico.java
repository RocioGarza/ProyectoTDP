package proyectil;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilJugadorMultiGrafico extends ProyectilJugadorGrafico{

	protected ProyectilJugadorMultiGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorMulti.png"));
	}
}
