package Inteligencia;

import enemigo.EnemigoKamikaze;
import entidad.Posicion;

public class IA_KamikazeAtaque extends InteligenciaEnemigo{

	
	private EnemigoKamikaze enemigo;
	private int xRetorno;
	private int yRetorno;
	private int vel;
	
	public IA_KamikazeAtaque(EnemigoKamikaze e) {
		super();
		enemigo = e;
		xRetorno = e.getPosicion().getX();
		yRetorno = e.getPosicion().getY();
		if(r.nextInt(2)==0)
			vel = enemigo.getVelocidadDeMovimiento();
		else
			vel = -enemigo.getVelocidadDeMovimiento();
	}
	
	public void mover() {
		if((enemigo.getPosicion().getY()+enemigo.getPosicion().getAlto())>=(Posicion.getYmax())) {
				enemigo.getPosicion().setX(xRetorno);
				enemigo.getPosicion().setY(yRetorno);
				terminarAtaque();
		} else {
			if(((enemigo.getPosicion().getX()+enemigo.getPosicion().getAncho())>=(Posicion.getXmax())) ||
				 enemigo.getPosicion().getX()<=0)
				vel=-vel;
			enemigo.getPosicion().moverX(vel);
			enemigo.getPosicion().moverY(2);
		}
	}
	
	public void rebotar() {
		enemigo.getPosicion().setX(xRetorno);
		enemigo.getPosicion().setY(yRetorno);
		terminarAtaque();
	}
	
	private void terminarAtaque() {
		enemigo.getGrafico().changeIcon('w');
		enemigo.setInteligencia(new IA_Kamikaze(enemigo));
	}
}
