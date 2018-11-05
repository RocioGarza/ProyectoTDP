package logica;

import obstaculo.Irrompible;

public class GeneradorIrromp extends GeneradorEntidades {
	
	public Irrompible crear(int x, int y)
	{
		return new Irrompible(x, y);
	}

	public int getAlto()
	{
		return Irrompible.getAlto();
	}

	public int getAncho()
	{
		return Irrompible.getAncho();
	}
	
	public boolean generaEnemigo() {
		return false;
	}
}
