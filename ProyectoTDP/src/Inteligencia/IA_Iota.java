package Inteligencia;

import enemigo.Iota;

public class IA_Iota extends InteligenciaEnemigo{

	private Iota enemigo;
	protected long tiempoDisparo;

	public IA_Iota(Iota e) {
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
