package Inteligencia;

import java.util.Random;

import enemigo.AnomaliaTemporal;
import enemigo.Strelitzia;
import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilEnemigo;

public class InteligenciaStrelitzia extends InteligenciaEnemigo{

	private Strelitzia strelitzia;
	private long tiempoAtaque;
	private long tiempoMovimiento;
	private int movimiento;
	private long tiempoCD;
	
	public InteligenciaStrelitzia(Strelitzia s) {
		super();
		strelitzia=s;
		tiempoAtaque=-1000;
		tiempoMovimiento=-1000;
		movimiento=0;
		tiempoCD=1000;
	}
	
	public void mover() {
		int ataque = r.nextInt(10000);
		if(System.currentTimeMillis()-tiempoMovimiento>1000) {
			movimiento = r.nextInt(3);
			tiempoMovimiento = System.currentTimeMillis();
		}
		if(System.currentTimeMillis()-tiempoAtaque>tiempoCD) {
			if(ataque<9900) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
				if(movimiento==0) {
					strelitzia.getGrafico().changeIcon('d');
					strelitzia.getPosicion().moverX(strelitzia.getVelocidadDeMovimiento());
				}
				else {
					if(movimiento==1) {
						strelitzia.getGrafico().changeIcon('a');
						strelitzia.getPosicion().moverX(-strelitzia.getVelocidadDeMovimiento());
					} else
						strelitzia.getGrafico().changeIcon('w');
				}
			} else {
				strelitzia.getGrafico().changeIcon(' ');
				atacar();
				tiempoAtaque=System.currentTimeMillis();
			}
		}
	}
	
	private void atacar() {
		Random r = new Random();
		int aux = r.nextInt(100);
		if(aux<90)
			lluviaDeBalas();
		else
			vacioTemporal();
	}
	
	private void lluviaDeBalas() {
		Random r = new Random();
		for(int i=0 ; i<10 ; i++)
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigo(r.nextInt(Posicion.getXmax()), 50, strelitzia.getDaño()/6 , strelitzia.getVelocidadDeAtaque()));
		tiempoCD=1800;
	}
	
	private void vacioTemporal() {
		Random r = new Random();
		for(int i=0 ; i<5 ; i++)
			Entorno.getEntorno().agregarEntidad(new AnomaliaTemporal(r.nextInt(Posicion.getXmax())-AnomaliaTemporal.getAncho(), 200+r.nextInt(200)));
		tiempoCD=10000;
	}

}
