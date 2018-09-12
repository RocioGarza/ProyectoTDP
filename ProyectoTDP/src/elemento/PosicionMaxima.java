package elemento;

public class PosicionMaxima {
	
	private static final int X = 1280;
	private static final int Y = 1024;
	private static PosicionMaxima instancia;
	
	public static PosicionMaxima getPosicionMaxima() {
		if(instancia==null)
			instancia = new PosicionMaxima();
		return instancia;
	}
	
	public static int getX() {
		return X;
	}
	
	public static int getY() {
		return Y;
	}

}
