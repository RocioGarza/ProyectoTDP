package EntidadGrafica;

import javax.swing.ImageIcon;

import entidad.Posicion;

public class IotaGrafico extends EntidadGrafica {

	public IotaGrafico(Posicion pos) {
		super(pos);
		
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/EnemigoArmadoCongelado.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/Iota.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/IotaAtaque.gif"));
	}
	
	public void actualizarGraficos() {
		image[0] = new ImageIcon(this.getClass().getResource("/Graficos/IotaSinArma.png"));
		image[1] = new ImageIcon(this.getClass().getResource("/Graficos/IotaSinArmaCongelado.png"));
		image[2] = new ImageIcon(this.getClass().getResource("/Graficos/IotaSinArma.png"));
		image[3] = new ImageIcon(this.getClass().getResource("/Graficos/IotaSinArma.png"));
		image[4] = new ImageIcon(this.getClass().getResource("/Graficos/IotaSinArma.png"));
	}
}
