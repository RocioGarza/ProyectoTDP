package entidad;

public class Posicion {

	private int X;
	private int Y;
	private int alto;
	private int ancho;
	private static final int Xmax = 1440;
	private static final int Ymax = 900;

	
	public Posicion(int X, int Y, int alto, int ancho) {
		if (X<0)
			this.X=0;
		else
			if(X+ancho>Xmax)
				this.X=Xmax-ancho;
			else
				this.X=X;
		
		if (Y<0)
			this.Y=0;
		else
			if(Y+alto>Ymax)
				this.Y=Ymax-alto;
			else
				this.Y=Y;
		this.ancho=ancho;
		this.alto=alto;
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
	
	public static int getXmax() {
		return Xmax;
	}
	
	public static int getYmax() {
		return Ymax;
	}
	
	public void moverX(int cantX) {
		if (X+ancho+cantX > Xmax) 
			X = Xmax-ancho;
		else
			if (X+cantX < 0) 
				X = 0;
			else
				X = X + cantX;
	}
	
	public void moverY(int cantY) {
		if (Y+alto+cantY > Ymax) 
			Y = Ymax-alto;
		else
			if (Y+cantY < 0) 
				Y = 0;
			else
				Y = Y + cantY;
	}
		
	public void setX(int x) {
		if((x+ancho)>Xmax)
			X=(Xmax-ancho);
		else
			if(x<0)
				X=0;
			else
				X=x;
	}
	
	public void setY(int y) {
		if((y+alto)>Ymax)
			X=(Ymax-alto);
		else
			if(y<0)
				Y=0;
			else
				Y=y;
	}
	
	public boolean estaEnXmax() {
		return X+ancho==Xmax;
	}
	
	public boolean estaEnYmax() {
		return Y+alto==Ymax;
	}
}
