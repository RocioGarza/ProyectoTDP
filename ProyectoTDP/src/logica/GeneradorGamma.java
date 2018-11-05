package logica;

import enemigo.Gamma;

public class GeneradorGamma extends GeneradorEntidades {
	
	public Gamma crear(int x, int y)
	{
		return new Gamma(x, y);
	}

	public int getAlto()
	{
		return Gamma.getAlto();
	}

	public int getAncho()
	{
		return Gamma.getAncho();
	}
	
	public boolean generaEnemigo() {
		return true;
	}
}
