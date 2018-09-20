package enemigo;

import entidad.Personaje;
import obstaculo.Obstaculo;
import proyectil.ProyectilJugador;

public abstract class Enemigo extends Personaje {
	
	protected Inteligencia inteligencia; 
	
	public Enemigo (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
		inteligencia = new Inteligencia(this);
	}
	
	public int getDaño() {
		return dañoAtaque;
	}
	
	public void serColisionado(ProyectilJugador p) {
		vida=0;
	}
	
	public void serColisionado(Obstaculo e) {
		System.out.println('a');
		inteligencia.rebotar();
	}
	
	public void serColisionado(Alpha e) {
		System.out.println('a');
		inteligencia.rebotar();
	}
	
	public void serColisionado(Beta e) {
		System.out.println('a');
		inteligencia.rebotar();
	}
	
	public void serColisionado(Gamma e) {
		System.out.println('a');
		inteligencia.rebotar();
	}
	
	public void serColisionado(Delta e) {
		System.out.println('a');
		inteligencia.rebotar();
	}
	
	public void serColisionado(Iota e) {
		System.out.println('a');
		inteligencia.rebotar();
	}

}
