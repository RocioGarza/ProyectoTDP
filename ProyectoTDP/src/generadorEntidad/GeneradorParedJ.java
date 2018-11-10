package generadorEntidad;

import obstaculo.ParedJugador;

public class GeneradorParedJ extends GeneradorEntidades {
	
	public ParedJugador crear(int x, int y)
	{
		return new ParedJugador(x, y);
	}

	public int getAlto()
	{
		return ParedJugador.getAlto();
	}

	public int getAncho()
	{
		return ParedJugador.getAncho();
	}
	
	public boolean generaEnemigo() {
		return false;
	}
}
