package obstaculo;

import javax.swing.ImageIcon;
import elemento.ElementoGrafico;

public class ParedJugadorGrafica extends ElementoGrafico {

	protected ParedJugadorGrafica(int X, int Y, int alto, int ancho, int velocidad) {
		super(X, Y, alto, ancho, velocidad);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador/ParedJugador.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador/ParedJugador.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador/ParedJugador.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador/ParedJugador.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/ParedJugador/ParedJugador.png"));
	}
	
}
