package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class ProyectilLanzaIzquierdaGrafica  extends ProyectilEnemigoGrafico{

	public ProyectilLanzaIzquierdaGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaIzquierda.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaIzquierda.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaIzquierda.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaIzquierda.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ProyectilLanzaIzquierda.png"));
	}
}
