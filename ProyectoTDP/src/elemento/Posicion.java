package elemento;

public class Posicion {

	private int X;
	private int Y;
	private int alto;
	private int ancho;
	
	public Posicion(int X, int Y, int alto, int ancho) {
		this.X=X;
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
	
	public void moverX(int cantX) {
		//Tener en cuenta que no se pase del mapa
		X = X + cantX; 
	}
	
	public void moverY(int cantY) {
		Y = Y + cantY;
	}
}
