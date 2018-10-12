package enemigo;

import extra.Contador;
import proyectil.Proyectil;

public class IA_Armado extends Inteligencia{
	
	private EnemigoArmado enemigo;
	protected Contador contador;

	public IA_Armado(EnemigoArmado e) {
		super();
		enemigo=e;
		contador = new Contador();
	}
	
	public Proyectil mover() {
		int aux = r.nextInt(2500);
		if(contador.disponible()) {
			if(aux<2450) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
				if(direccion=='d') {
					enemigo.getGrafico().changeIcon('d');
					enemigo.getPosicion().moverX(enemigo.getVelocidadDeMovimiento());
					if(enemigo.getPosicion().estaEnXmax())
						direccion='a';
				}
				else {
					if(direccion=='a') {
						enemigo.getGrafico().changeIcon('a');
						enemigo.getPosicion().moverX(-enemigo.getVelocidadDeMovimiento());
						if(enemigo.getPosicion().getX()==0)
							direccion='d';
					} 
				}
			} else {
				contador.iniciar(80);
				return enemigo.atacar();
			}
		} else
			contador.decrementarContador();
		return null;
	}

}
