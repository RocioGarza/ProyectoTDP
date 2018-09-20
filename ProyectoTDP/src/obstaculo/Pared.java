package obstaculo;

import entidad.Entidad;
import proyectil.ProyectilJugador;

public class Pared extends Obstaculo{

	private ParedGrafica grafico;
	
	public Pared (int X, int Y) {
		super(X, Y, getAlto(), getAncho());	
		grafico = new ParedGrafica(pos);
	}
	
	public static int getAlto() {
		return 100;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public ParedGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}public void chocar(Entidad e) {
		e.serChocado(this);
	}

	public void serChocado(ProyectilJugador e) {
		e.quitarVida(10);
	}
}
