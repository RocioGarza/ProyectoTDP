package proyectil;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class ProyectilJugadorGrafico extends EntidadGrafica{

	protected ProyectilJugadorGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugador.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugador.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugador.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugador.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugador.png"));
	}
}
