package Inteligencia;

import java.util.Random;

import enemigo.AnomaliaTemporal;
import enemigo.Strelitzia;
import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilEnemigoBasico;
import proyectil.ProyectilEnemigoDelay;
import proyectil.ProyectilLanzaCentro;
import proyectil.ProyectilLanzaDerecha;
import proyectil.ProyectilLanzaIzquierda;

public class InteligenciaStrelitzia extends InteligenciaEnemigo{

	protected Strelitzia strelitzia;
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
			if(ataque<9800) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
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
		if(aux<55)
			lluviaDeBalas();
		else
			if(aux<85)
				invocacionDeLanzas();
			else
				if(aux<95)
				vacioTemporal();
			else
				finalStorm();
	}
	
	private void lluviaDeBalas() {
		Random r = new Random();
		for(int i=0 ; i<10 ; i++)
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigoBasico(r.nextInt(Posicion.getXmax()), 50, strelitzia.getDaño()/6 , strelitzia.getVelocidadDeAtaque()));
		tiempoCD=1500;
	}
	
	private void vacioTemporal() {
		Random r = new Random();
		for(int i=0 ; i<5 ; i++)
			Entorno.getEntorno().agregarEntidad(new AnomaliaTemporal(r.nextInt(Posicion.getXmax())-AnomaliaTemporal.getAncho(), 200+r.nextInt(200)));
		tiempoCD=10000;
	}
	
	private void invocacionDeLanzas() {
		int posX=strelitzia.getPosicion().getX()+(strelitzia.getPosicion().getAncho())/2;
		int posY=strelitzia.getPosicion().getY()+strelitzia.getPosicion().getAlto();
		Entorno.getEntorno().agregarEntidad(new ProyectilLanzaIzquierda(posX,posY,strelitzia.getDaño(),strelitzia.getVelocidadDeAtaque()));
		Entorno.getEntorno().agregarEntidad(new ProyectilLanzaCentro(posX,posY,strelitzia.getDaño(),strelitzia.getVelocidadDeAtaque()));
		Entorno.getEntorno().agregarEntidad(new ProyectilLanzaDerecha(posX,posY,strelitzia.getDaño(),strelitzia.getVelocidadDeAtaque()));
		tiempoCD=500;
	}
	
	private void finalStorm() {
		int delay=0;
		Random r = new Random();
		delay=crearOlaIzquierda(delay);
		delay=crearOlaDerecha(delay);
		delay=crearCascadaAbertura(600,delay);
		delay=crearCascadaAbertura(900,delay);
		for(int i=0; i<10 ; i++)
			delay=crearCascadaAbertura(500+r.nextInt(940),delay);
		tiempoCD=25000;
	}
	
	private int crearOlaIzquierda(int delay) {
		int posX = 0;
		for(int i=0 ; i<23 ; i++) {
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigoDelay(posX,0,strelitzia.getDaño()/4,strelitzia.getVelocidadDeAtaque(),delay));
			posX=posX+50;
			delay=delay+100;
		}
		return delay+1000;
	}
	
	private int crearOlaDerecha(int delay) {
		int posX = Posicion.getXmax();
		for(int i=0 ; i<23 ; i++) {
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigoDelay(posX,0,strelitzia.getDaño()/4,strelitzia.getVelocidadDeAtaque(),delay));
			posX=posX-50;
			delay=delay+100;
		}
		return delay+1000;
	}
	
	private int crearCascadaAbertura(int x, int delay) {
		int posX=0;
		while(posX<=x-300) {
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigoDelay(posX,0,strelitzia.getDaño()/4,2*strelitzia.getVelocidadDeAtaque()/3,delay));
			posX=posX+50;
		}
		posX=posX+400;
		while(posX<Posicion.getXmax()) {
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigoDelay(posX,0,strelitzia.getDaño()/4,2*strelitzia.getVelocidadDeAtaque()/3,delay));
			posX=posX+50;
		}	
		return delay+1000;
	}

}
