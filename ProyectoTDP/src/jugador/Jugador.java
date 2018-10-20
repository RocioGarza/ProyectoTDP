package jugador;

import java.util.LinkedList;
import java.util.Queue;

import arma.ArmaJugador;
import arma.ArmaJugadorBasicaLaser;
import arma.ArmaJugadorBasicaProyectil;
import colisionador.ColisionadorJugador;
import entidad.Entidad;
import entidad.Personaje;
import escudo.Escudo;
import escudo.EscudoAntiKamikaze;
import escudo.EscudoNormal;
import proyectil.Proyectil;

public class Jugador extends Personaje{

	private Queue<ArmaJugador>  armasJugador;
	private ArmaJugador arma;
	private Escudo escudo;
	private JugadorGrafico grafico;
	
	public Jugador(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 5;
		velocidadDeAtaque = 5;
		vidaMaxima = 100;
		vida = vidaMaxima;
		dañoAtaque = 5;
		armasJugador = new LinkedList<ArmaJugador>();
		armasJugador.add(new ArmaJugadorBasicaLaser(pos));
		arma = new ArmaJugadorBasicaProyectil(pos);
		escudo = new EscudoNormal();
		grafico = new JugadorGrafico(pos);	
		colisionador = new ColisionadorJugador();
	}
	
	public static int getAlto() {
		return 160;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public void setArma(char c) {
		//Requisito: c debe ser un caracter valido asociado a un arma
	}
	
	public void setEscudo(char c) {
		//Requisito: c debe ser un caracter valido asociado a un escudo
		if (c=='n') 
			escudo = new EscudoNormal();
		else
			if (c=='k')
				escudo = new EscudoAntiKamikaze();
	}
	
	protected void morir() {
		//hacer algo
	}
	
	public void mover() {}
	
	public void mover(char c) {
		if (c=='a')
			pos.moverX(-velocidadDeMovimiento);
		else
			if (c=='d')
				pos.moverX(velocidadDeMovimiento);
	}
	
	public Proyectil disparar(char c) {
		if (c==' ') 
			return arma.disparar(dañoAtaque, velocidadDeAtaque);
		else 
			return null;
	}
	
	public void cambiarArma() {
		armasJugador.add(arma);
		arma = armasJugador.poll();
	}
	
	/*private void controlarEscudo() {
		if (escudo.getDuracion()==0)
			escudo = new EscudoNormal();
	}*/
	
	public JugadorGrafico getGrafico() {
		return grafico;
	}

	public Proyectil atacar() {
		return null;
	}
	
	public ArmaJugador getArma() {
		return arma;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
