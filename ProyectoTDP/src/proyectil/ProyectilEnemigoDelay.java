package proyectil;

import entidad.Posicion;

public class ProyectilEnemigoDelay extends ProyectilEnemigoBasico {

	private long tiempo;
	private int delay;
	
	public ProyectilEnemigoDelay(int X, int Y, int da�o, int VM, int d) {
		super(X, Y, da�o, VM);
		delay=d;
		tiempo=System.currentTimeMillis();
	}

	public void mover() {
		if(System.currentTimeMillis()-tiempo>delay) {
			pos.moverY(velocidadDeMovimiento);
			if(pos.getY() == 0 || pos.getY()+pos.getAlto() == Posicion.getYmax())
				vida=0;
		}
	}
}
