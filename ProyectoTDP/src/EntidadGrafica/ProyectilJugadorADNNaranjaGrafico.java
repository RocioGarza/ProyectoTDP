package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilJugadorADNNaranjaGrafico extends EntidadGrafica{

	public ProyectilJugadorADNNaranjaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNNaranja.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNNaranja.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNNaranja.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNNaranja.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNNaranja.gif"));
	}
}
