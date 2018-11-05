package logica;

import obstaculo.Pared;

public class GeneradorPared extends GeneradorEntidades {
	
	public Pared crear(int x, int y)
	{
		return new Pared(x, y);
	}
	
	public int getAlto()
	{
		return Pared.getAlto();
	}

	public int getAncho() {
		return Pared.getAncho();
	}

	public boolean generaEnemigo() {
		return false;
	}
}
