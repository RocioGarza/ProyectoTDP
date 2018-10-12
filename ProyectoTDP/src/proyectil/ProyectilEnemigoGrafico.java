package proyectil;

import javax.swing.ImageIcon;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class ProyectilEnemigoGrafico  extends EntidadGrafica{

	protected ProyectilEnemigoGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilEnemigo.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilEnemigo.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilEnemigo.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilEnemigo.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilEnemigo.png"));
	}
}
