package Inteligencia;

import entidad.Posicion;
import proyectil.Proyectil;

public class InteligenciaCohete extends InteligenciaProyectil{

	private long tiempoDisparo;
	private long incrementarVel;
	
	public InteligenciaCohete(Proyectil p) {
		super(p);
		tiempoDisparo = System.currentTimeMillis();
		incrementarVel = -1000;
	}
	
	public void mover() {
		if(System.currentTimeMillis()-tiempoDisparo>250) {
			proyectil.getPosicion().moverY(-proyectil.getVelocidadDeMovimiento());
			controlarVelocidad();
			actualizarImagen();
			controlarLimites();
		}
	}
	
	private void controlarVelocidad() {
		if(System.currentTimeMillis()-incrementarVel>500 && proyectil.getVelocidadDeMovimiento()<10) {
			incrementarVel=System.currentTimeMillis();
			proyectil.aumentarVelocidadDeMovimiento(1+proyectil.getVelocidadDeMovimiento()/3);
		}
	}
	
	private void controlarLimites() {
		if(proyectil.getPosicion().getY()==0 || proyectil.getPosicion().getY()==Posicion.getYmax())
			proyectil.quitarVida(proyectil.getVidaMaxima());
	}
	
	private void actualizarImagen() {
		if(proyectil.getVelocidadDeMovimiento()>6)
			proyectil.getGrafico().changeIcon(' ');
		else
			if(proyectil.getVelocidadDeMovimiento()>4)
				proyectil.getGrafico().changeIcon('a');
			else
				if(proyectil.getVelocidadDeMovimiento()>2)
					proyectil.getGrafico().changeIcon('d');
				else
					if(proyectil.getVelocidadDeMovimiento()>0)
						proyectil.getGrafico().changeIcon('s');
	}
}
