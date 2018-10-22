package jugador;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import entidad.EntidadGrafica;
import entidad.Posicion;

public class JugadorGrafico extends EntidadGrafica {

	protected JugadorGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/Jugador.gif"));
		grafico=new JLabel(image[0]);
	}

}
