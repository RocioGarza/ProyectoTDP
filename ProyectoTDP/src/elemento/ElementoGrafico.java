package elemento;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class ElementoGrafico {

	protected JLabel grafico;
	protected Icon image[];
	protected Posicion pos;
	protected int velocidad;
	
	protected ElementoGrafico(int X, int Y, int alto, int ancho, int velocidad) {
		pos= new Posicion(X,Y,alto,ancho);
		this.velocidad = velocidad;
	
		this.image = new Icon[5];
	}
	
	public int getVelocidad() {
		return velocidad;
	} 
	
	public Posicion getPos() {
		return pos;
	}
	
	protected void changeIcon(char c) {
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
	}
	
	public void mover(char c) {
		if(this.grafico!=null) {
			changeIcon(c);
			
			
				switch (c){
				case 'w' : // Arriba
					for(int i = 0; (i < velocidad); i += 1){
						pos.moverY(1);
						grafico.setBounds(pos.getX() , pos.getY(), pos.getAncho(), pos.getAlto());
					}
					break;
				case 's' : // Abajo
					for(int i = 0; (i < velocidad); i += 1){
						pos.moverY(-1);
						grafico.setBounds(pos.getX() , pos.getY(), pos.getAncho(), pos.getAlto());
					}
					break;
				case 'd' : // Derecha
					for(int i = 0; (i < velocidad); i += 1){
						pos.moverX(1);
						grafico.setBounds(pos.getX() , pos.getY(), pos.getAncho(), pos.getAlto());
					}
					break;
				case 'a' : // Derecha
					for(int i = 0; (i < velocidad); i += 1){
						pos.moverX(-1);
						grafico.setBounds(pos.getX() , pos.getY(), pos.getAncho(), pos.getAlto());
					}
					break;
				}
		}
	}
	
	public JLabel getGrafico() {
		if(grafico == null) {
			grafico = new JLabel(image[0]);
			grafico.setBounds(pos.getX(), pos.getY(), pos.getAncho(), pos.getAlto());
		}
		
		return grafico;
	}
}
