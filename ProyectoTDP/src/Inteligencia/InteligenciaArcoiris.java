package Inteligencia;

import java.util.Random;

import entidad.Entidad;
import entidad.Posicion;
import logica.Entorno;
import proyectil.BuscadorObjetivo;
import proyectil.ProyectilJugadorArcoiris;

public class InteligenciaArcoiris{

	private ProyectilJugadorArcoiris proyectil;
	private Entidad objetivo;
	Random r;
	
	public InteligenciaArcoiris(ProyectilJugadorArcoiris p) {
		proyectil=p;
		r = new Random();
	}
	
	public void establecerObjetivo(Entidad e) {
		objetivo=e;
	}
	
	public void mover() {
		if (objetivo!=null && objetivo.estaViva()) {
			if (proyectil.getPosicion().getX()>objetivo.getPosicion().getX())
				proyectil.getPosicion().moverX(-proyectil.getVelocidadDeMovimiento()+(r.nextInt(20)-10));
			else
				proyectil.getPosicion().moverX(proyectil.getVelocidadDeMovimiento()+(r.nextInt(20)-10));
			if (proyectil.getPosicion().getY()>objetivo.getPosicion().getY())
				proyectil.getPosicion().moverY(-proyectil.getVelocidadDeMovimiento()+(r.nextInt(20)-10));
			else
				proyectil.getPosicion().moverY(proyectil.getVelocidadDeMovimiento()+(r.nextInt(20)-10));
		} else {
			BuscadorObjetivo buscador = new BuscadorObjetivo(proyectil);
			Entorno.getEntorno().serAfectado(buscador);
		}
		controlarLimites();
	}
	
	private void controlarLimites() {
		if(proyectil.getPosicion().getY()==0 || proyectil.getPosicion().getY()==Posicion.getYmax())
			proyectil.quitarVida(proyectil.getVidaMaxima());
	}
}
