package elemento;

public class Posicion {

	private int X;
	private int Y;
	private int alto;
	private int ancho;
	private PosicionMaxima posMaxima;

	public Posicion(int X, int Y, int alto, int ancho) {
		this.X=X;
		this.Y=Y;	
		this.ancho=ancho;
		this.alto=alto;
		this.posMaxima = PosicionMaxima.getPosicionMaxima();
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public int getMaxX() {
		return posMaxima.getX();
	}
	
	public void moverX(int cantX) {
		if(cantX > 0) {//avanza a derecha
			if (X+(ancho/2)+cantX > posMaxima.getX())
				X = posMaxima.getX()-(ancho/2);
			else
				X = X + cantX;
		}else {// si llega al borde izquierdo
			if (X-(ancho/2)+cantX < 0)
				X = (ancho/2);
			else
				X = X - cantX;
		}

	}

	public void moverY(int cantY) {
		if (Y+(alto/2)+cantY>posMaxima.getY())
			Y = posMaxima.getY()-(alto/2);
		else
			Y = Y + cantY;
	}
}
