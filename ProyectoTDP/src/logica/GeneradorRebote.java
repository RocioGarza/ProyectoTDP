package logica;

import obstaculo.Rebote;

public class GeneradorRebote extends GeneradorEntidades {
	
	public Rebote crear(int x, int y)
	{
		return new Rebote(x, y);
	}
	
	public int getAlto()
	{
		return Rebote.getAlto();
	}

	public int getAncho()
	{
		return Rebote.getAncho();
	}

	public boolean generaEnemigo() {
		return false;
	}
}
