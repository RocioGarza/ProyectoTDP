package generadorEntidad;

import enemigo.Delta;

public class GeneradorDelta extends GeneradorEntidades {
	
	public Delta crear(int x, int y)
	{
		return new Delta(x, y);
	}

	public int getAlto()
	{
		return Delta.getAlto();
	}

	public int getAncho()
	{
		return Delta.getAncho();
	}
	
	public boolean generaEnemigo() {
		return true;
	}
}
