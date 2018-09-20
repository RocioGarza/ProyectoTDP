package jugador;

import javax.swing.ImageIcon;
import entidad.EntidadGrafica;
import entidad.Posicion;

public class JugadorGrafico extends EntidadGrafica {

	protected JugadorGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.png"));
	}

}
