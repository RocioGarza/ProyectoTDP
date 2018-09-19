package entidad;

public class Posicion {

	private int X;
	private int Y;
	private int alto;
	private int ancho;
	private static final int Xmax = 1024;
	private static final int Ymax = 1280;

	
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
		System.out.println(X);
		System.out.println(Y);
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
		boolean termine=false;
		int i=0;
		int aux;
		
		if(cantX>0)
			aux=1;
		else {
			aux=-1;
			cantX=-cantX;
		}
		while(i<cantX && !termine) {
			if (X+ancho+aux > Xmax) {
				X = Xmax-ancho;
				termine = true;
			}
			else {
				if (X+aux < 0) {
					X = 0;
					termine=true;
				}
				else
					X = X + aux;
			}
			i++;
		}
	}

	public void moverY(int cantY) {
		boolean termine=false;
		int i=0;
		int aux;
		
		if(cantY>0)
			aux=1;
		else {
			aux=1;
			cantY=-cantY;
		}
		while(i<cantY && !termine) {
			if (Y+alto+aux > Xmax) {
				Y = Ymax-alto;
				termine = true;
			}
			else {
				if (Y+aux < 0) {
					Y = 0;
					termine=true;
				}
				else
					Y = Y + aux;
			}
		}
	}
	
	public boolean estaEnXmax() {
		return X+ancho==Xmax;
	}
	
	public boolean estaEnYmax() {
		return Y+alto==Ymax;
	}
}
