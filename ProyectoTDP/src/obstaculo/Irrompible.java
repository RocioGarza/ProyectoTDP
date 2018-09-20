package obstaculo;

import entidad.Entidad;
import proyectil.ProyectilJugador;

public class Irrompible extends Obstaculo{

	private IrrompibleGrafico grafico;
	
	public Irrompible (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new IrrompibleGrafico(pos);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public IrrompibleGrafico getGrafico() {
		return grafico;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	public void chocar(Entidad e) {
		e.serChocado(this);
	}

	public void serChocado(ProyectilJugador e) {
		e.quitarVida(10);
	}
}
