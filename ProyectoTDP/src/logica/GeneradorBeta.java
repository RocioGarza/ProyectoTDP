package logica;

import enemigo.Beta;

public class GeneradorBeta extends GeneradorEntidades {
	
	public Beta crear(int x, int y)
	{
		return new Beta(x, y);
	}

	public int getAlto()
	{
		return Beta.getAlto();
	}

	public int getAncho()
	{
		return Beta.getAncho();
	}
	
	public boolean generaEnemigo() {
		return true;
	}
}
