package premio;

import javax.swing.ImageIcon;

import EntidadGrafica.EntidadGrafica;
import entidad.Posicion;

public class EscudoKamikazeGrafico extends EntidadGrafica{

	protected EscudoKamikazeGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/EscudoKamikaze.gif"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/EscudoKamikaze.gif"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/EscudoKamikaze.gif"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/EscudoKamikaze.gif"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/EscudoKamikaze.gif"));
	}
}
