package enemigo;

import java.util.Random;

import extra.Contador;

public class Inteligencia {

	private Enemigo enemigo;
	private char direccion;
	private Random r;
	private Contador contador;
	
	public Inteligencia(Enemigo e) {
		enemigo=e;
		contador = new Contador(80);
		r = new Random();
		int aux = r.nextInt(100);
		if(aux<50)
			direccion='d';
		else
			direccion='a';
	}
	
	public void mover() {
		int aux = r.nextInt(1000);
		if(contador.disponible()) {
			if(aux<995) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
				if(direccion=='d') {
					enemigo.getPosicion().moverX(enemigo.getVelocidadDeMovimiento());
					if(enemigo.getPosicion().estaEnXmax())
						direccion='a';
				}
				else {
					if(direccion=='a') {
						enemigo.getPosicion().moverX(-enemigo.getVelocidadDeMovimiento());
						if(enemigo.getPosicion().getX()==0)
							direccion='d';
					} 
				}
			} else {
				enemigo.atacar();
				contador.iniciar();
			}
		} else
			contador.incrementarContador();
	}
}
