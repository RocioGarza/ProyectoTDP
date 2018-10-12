package enemigo;

import proyectil.Proyectil;

public class IA_Kamikaze extends Inteligencia{

	private EnemigoKamikaze enemigo;
	
	public IA_Kamikaze(EnemigoKamikaze e) {
		super();
		enemigo = e;	
	}
	
	public Proyectil mover() {
		int aux = r.nextInt(10000);
		if(aux<9975) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
			if(direccion=='d') {
				enemigo.getGrafico().changeIcon('d');
				enemigo.getPosicion().moverX(enemigo.getVelocidadDeMovimiento());
				if(enemigo.getPosicion().estaEnXmax())
					direccion='a';
			} else {
				if(direccion=='a') {
					enemigo.getGrafico().changeIcon('a');
					enemigo.getPosicion().moverX(-enemigo.getVelocidadDeMovimiento());
					if(enemigo.getPosicion().getX()==0)
						direccion='d';
				} 
			}
		} else 
			enemigo.atacar();
		return null;
	}

}
