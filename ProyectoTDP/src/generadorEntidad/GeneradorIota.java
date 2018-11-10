package generadorEntidad;

import enemigo.Alpha;
import enemigo.Iota;

public class GeneradorIota extends GeneradorEntidades {
	
	public Iota crear(int x, int y)
	{
		return new Iota(x, y);
	}
	
	public int getAlto()
	{
		return Iota.getAlto();
	}

	public int getAncho()
	{
		return Iota.getAncho();
	}

	public boolean generaEnemigo() {
		return true;
	}
}
