package generadorEntidad;

import enemigo.Alpha;

public class GeneradorAlpha extends GeneradorEntidades {
	
	public Alpha crear(int x, int y)
	{
		return new Alpha(x, y);
	}
	
	public int getAlto()
	{
		return Alpha.getAlto();
	}

	public int getAncho()
	{
		return Alpha.getAncho();
	}
	
	public boolean generaEnemigo() {
		return true;
	}
}
