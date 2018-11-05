package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilJugadorADNAzulGrafico extends EntidadGrafica{

	public ProyectilJugadorADNAzulGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNAzul.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNAzul.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNAzul.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNAzul.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilADNAzul.gif"));
	}
}
