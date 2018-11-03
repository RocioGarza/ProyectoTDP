package proyectil;

import entidad.Posicion;

public abstract class InteligenciaADN extends InteligenciaProyectil{

	private int eje;
	private int amplitud = 100;
	private int vel;
	protected boolean direccion; //true-> se mueve a la izquierda, false->se mueve a la derecha
	
	public InteligenciaADN(Proyectil p) {
		super(p);
		vel = 0;
		eje=p.getPosicion().getX();
	}

	public void mover() {
		if(direccion)
			moverIzquierda();
		else
			moverDerecha();
		controlarLimites();
	}
	
	private void moverIzquierda() {
		proyectil.getPosicion().moverX(vel);
		proyectil.getPosicion().moverY(-3);
		if(vel>-6)
			vel--;
		if(proyectil.getPosicion().getX() <= (eje-amplitud) || proyectil.getPosicion().getX() <= 0 || proyectil.getPosicion().getX() >= Posicion.getXmax()) {
			vel=0;
			direccion=false;
		}
	}
	
	private void moverDerecha() {
		proyectil.getPosicion().moverX(vel);
		proyectil.getPosicion().moverY(-3);
		if(vel<6)
			vel++;
		if(proyectil.getPosicion().getX() >= (eje+amplitud)) {
			vel=0;
			direccion=true;
		}
	}

	private void controlarLimites() {
		if(proyectil.getPosicion().getY()==0 || proyectil.getPosicion().getY()==Posicion.getYmax())
			proyectil.quitarVida(proyectil.getVidaMaxima());
	}
}

