package proyectil;

import entidad.EntidadGrafica;

public class ProyectilEnemigo extends Proyectil{
	
	public ProyectilEnemigo(int X, int Y, int VM, int da�o) {
		super(X,Y,5,10,VM,da�o);
	}

	@Override
	public EntidadGrafica getGrafico() {
		// TODO Auto-generated method stub
		return null;
	}
}
