package proyectil;

import entidad.EntidadGrafica;

public class ProyectilJugador extends Proyectil {

	public ProyectilJugador(int X, int Y, int VM, int daño) {
		super(X,Y,10,5,VM,daño);
	}

	@Override
	public EntidadGrafica getGrafico() {
		// TODO Auto-generated method stub
		return null;
	}
}
