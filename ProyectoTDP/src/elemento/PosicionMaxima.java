package elemento;

public class PosicionMaxima {
	
	private static final int X = 1024;
	private static final int Y = 1280;
	private static PosicionMaxima instancia;
	
	public static PosicionMaxima getPosicionMaxima() {
		if(instancia==null)
			instancia = new PosicionMaxima();
		return instancia;
	}
	
	public static int getX() {
		if(instancia==null)
			instancia = new PosicionMaxima();
		return X;
	}
	
	public static int getY() {
		if(instancia==null)
			instancia = new PosicionMaxima();
		return Y;
	}

}
