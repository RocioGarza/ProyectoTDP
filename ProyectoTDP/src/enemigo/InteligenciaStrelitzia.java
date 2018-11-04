package enemigo;

import java.util.Random;

import entidad.Posicion;
import logica.Entorno;
import proyectil.ProyectilEnemigo;

public class InteligenciaStrelitzia extends Inteligencia{

	private Strelitzia strelitzia;
	private long tiempoAtaque;
	private long tiempoMovimiento;
	private int movimiento;
	
	public InteligenciaStrelitzia(Strelitzia s) {
		super();
		strelitzia=s;
		tiempoAtaque=-1000;
		tiempoMovimiento=-1000;
		movimiento=0;
	}
	
	public void mover() {
		int ataque = r.nextInt(9000);
		if(System.currentTimeMillis()-tiempoMovimiento>1000) {
			movimiento = r.nextInt(3);
			tiempoMovimiento = System.currentTimeMillis();
		}
		if(System.currentTimeMillis()-tiempoAtaque>1500) {
			if(ataque<8985) { //Tiene un 99.5% de probabilidad de mover y un 0.5% de probabilidad de atacar
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
	}
	
	private void atacar() {
		Random r = new Random();
		for(int i=0 ; i<20 ; i++)
			Entorno.getEntorno().agregarEntidad(new ProyectilEnemigo(r.nextInt(Posicion.getXmax()), 50, strelitzia.getDaño()/4 , strelitzia.getVelocidadDeAtaque()));
	}

}
