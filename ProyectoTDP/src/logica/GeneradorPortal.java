package logica;

import obstaculo.Portal;

public class GeneradorPortal extends GeneradorEntidades {
	
	public Portal crear(int x, int y)
	{
		return new Portal(x, y);
	}
	public int getAlto()
	{
		return Portal.getAlto();
	}

	public int getAncho()
	{
		return Portal.getAncho();
	}
	
	public boolean generaEnemigo() {
		return false;
	}

}
