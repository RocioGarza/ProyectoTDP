package entidad;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {

	protected JLabel grafico;
	protected Icon image[];
	protected Posicion pos;
	
	protected EntidadGrafica(Posicion posicion) {
		pos= posicion;
		this.image = new Icon[5];
		for (Icon icono: image)
			icono=null;
		
	}

	public Posicion getPos() {
		return pos;
	}
	
	public void changeIcon(char c) {
		int d=0;
		if (c=='w')
			d=0;
		else
			if (c=='s')
				d=1;
			else
				if(c=='d')
					d=2;
				else
					if(c=='a')
						d=3;
					else
						if (c==' ')
							d=4;
		this.grafico.setIcon(this.image[d]);
		grafico.repaint();
	}
	
	public void actualizar() {
		grafico.setBounds(pos.getX(), pos.getY(), pos.getAncho(), pos.getAlto());
		grafico.repaint();
	}
		
	public JLabel getGrafico() {
		if(grafico == null) {
			grafico = new JLabel(image[0]);
			grafico.setBounds(pos.getX(), pos.getY(), pos.getAncho(), pos.getAlto());
		}
		
		return grafico;
	}
}
