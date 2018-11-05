package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;
import proyectil.ProyectilJugadorGrafico;

public class ProyectilJugadorArcoirisGrafico extends ProyectilJugadorGrafico{
	
	public ProyectilJugadorArcoirisGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilArcoiris1.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilArcoiris2.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilArcoiris3.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilArcoiris4.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilArcoiris5.png"));
	}
}