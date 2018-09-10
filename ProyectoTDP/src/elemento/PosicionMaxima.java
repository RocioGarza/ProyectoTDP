package elemento;

public class PosicionMaxima {
	
	private int X;
	private int Y;
	private static PosicionMaxima instancia;
	
	private PosicionMaxima(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	public void crearPosicionMaxima(int X, int Y) {
		//Despues de que se crea la primera PosicionMaxima este comando no hace nada
		if(instancia==null)
			instancia = new PosicionMaxima(X,Y);
	}
	
	public static PosicionMaxima getPosicionMaxima() {
		return instancia;
	}
	
	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}

}
