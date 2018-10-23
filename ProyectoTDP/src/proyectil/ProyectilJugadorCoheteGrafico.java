package proyectil;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilJugadorCoheteGrafico extends ProyectilJugadorGrafico{
	
	protected ProyectilJugadorCoheteGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete1.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete2.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete3.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete4.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Cohete5.png"));
	}
}
