package enemigo;

import java.util.Random;

import entidad.Posicion;
import logica.Entorno;
import premio.Pocion;
import proyectil.ProyectilEnemigo;

public class InteligenciaStrelitzia extends Inteligencia{

	private Strelitzia strelitzia;
	private long tiempoAtaque;
	private long tiempoMovimiento;
	private int movimiento;
	private long tiempoCuracion;
	
	public InteligenciaStrelitzia(Strelitzia s) {
		super();
		strelitzia=s;
		tiempoAtaque=-1000;
		tiempoMovimiento=-1000;
		movimiento=0;
		tiempoCuracion=System.currentTimeMillis();
	}
	
	public void mover() {
		int ataque = r.nextInt(9000);
		if(System.currentTimeMillis()-tiempoMovimiento>1000) {
			movimiento = r.nextInt(3);
			tiempoMovimiento = System.currentTimeMillis();
		}
		if(System.currentTimeMillis()-tiempoAtaque>1500) {
			if(ataque<8500) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
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
				tiempoAtaque=System.currentTimeMillis();
			}
		} else {
			if(System.currentTimeMillis()-tiempoAtaque>1000) {
				atacar();
				tiempoAtaque=-1000;
			
			}
		}
		if(System.currentTimeMillis()-tiempoCuracion>30000) {
			for(int i=0;i<4;i++)
				Entorno.getEntorno().agregarEntidad(new Pocion(strelitzia.getPosicion().getX()-strelitzia.getPosicion().getAncho()/2 , strelitzia.getPosicion().getY()+strelitzia.getPosicion().getAlto()));
			tiempoCuracion=System.currentTimeMillis();
		}
	}
	
	private void atacar() {
		Random r = new Random();
		for(int i=0 ; i<10 ; i++)
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigo(r.nextInt(Posicion.getXmax()), 50, strelitzia.getDaño()/6 , strelitzia.getVelocidadDeAtaque()));
	}

}
