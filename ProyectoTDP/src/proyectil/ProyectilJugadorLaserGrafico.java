package proyectil;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilJugadorLaserGrafico extends ProyectilJugadorGrafico{

	protected ProyectilJugadorLaserGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorLaser.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorLaser.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorLaser.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorLaser.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilJugadorLaser.png"));
	}

}
