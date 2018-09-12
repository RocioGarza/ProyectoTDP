package proyectil;

import elemento.ElementoGrafico;

public class ProyectilEnemigo extends Proyectil{
	
	public ProyectilEnemigo(int X, int Y, int VM, int daño) {
		super(X,Y,5,10,VM,daño);
	}

	@Override
	public ElementoGrafico getGrafico() {
		// TODO Auto-generated method stub
		return null;
	}
}
