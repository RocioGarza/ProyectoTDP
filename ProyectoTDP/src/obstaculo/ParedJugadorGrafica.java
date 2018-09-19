package obstaculo;

import javax.swing.ImageIcon;
import entidad.EntidadGrafica;
import entidad.Posicion;

public class ParedJugadorGrafica extends EntidadGrafica {

	protected ParedJugadorGrafica(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador.png"));
	}
	
}
