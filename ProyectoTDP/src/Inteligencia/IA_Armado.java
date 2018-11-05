package Inteligencia;

import enemigo.EnemigoArmado;

public class IA_Armado extends InteligenciaEnemigo{
	
	private EnemigoArmado enemigo;
	protected long tiempoDisparo;

	public IA_Armado(EnemigoArmado e) {
		super();
		enemigo=e;
		tiempoDisparo=-1000;
	}
	
	public void mover() {
		int aux = r.nextInt(3000);
		if(System.currentTimeMillis()-tiempoDisparo>900) {
			if(aux<2975) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
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
				tiempoDisparo=System.currentTimeMillis();
				enemigo.atacar();
			}
		} 
	}

}
