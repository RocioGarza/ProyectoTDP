package Inteligencia;

import enemigo.EnemigoKamikaze;
import entidad.Posicion;
import logica.Entorno;

public class IA_KamikazeAtaqueBuscador extends InteligenciaEnemigo{

	private EnemigoKamikaze enemigo;
	private int xRetorno;
	private int yRetorno;
	private int xObjetivo;
	private int vel;
	
	public IA_KamikazeAtaqueBuscador(EnemigoKamikaze e) {
		super();
		enemigo = e;
		vel = enemigo.getVelocidadDeMovimiento();
		xObjetivo = Entorno.getEntorno().getObjetivo().getX()+(Entorno.getEntorno().getObjetivo().getAncho()/2);
		xRetorno = e.getPosicion().getX();
		yRetorno = e.getPosicion().getY();
	}
	
	public void mover() {
		if((enemigo.getPosicion().getY()+enemigo.getPosicion().getAlto())>=(Posicion.getYmax())) {
				enemigo.getPosicion().setX(xRetorno);
				enemigo.getPosicion().setY(yRetorno);
				terminarAtaque();
		} else {
			if((enemigo.getPosicion().getX()+(enemigo.getPosicion().getAncho()/2))>=xObjetivo) {
				enemigo.getPosicion().moverX(-vel);
			}
			else {
				enemigo.getPosicion().moverX(vel);
			}
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
		enemigo.setInteligencia(new IA_KamikazeBuscador(enemigo));
	}
}
