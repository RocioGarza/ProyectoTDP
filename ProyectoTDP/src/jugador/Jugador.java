package jugador;

import arma.Arma;
import arma.ArmaJugador;
import elemento.PosicionMaxima;
import enemigo.EnemigoKamikaze;
import entidad.Personaje;
import escudo.Escudo;
import escudo.EscudoAntiKamikaze;
import escudo.EscudoNormal;
import proyectil.ProyectilEnemigo;

public class Jugador extends Personaje {

	private Arma arma;
	private Escudo escudo;
	private JugadorGrafico grafico;
	
	public Jugador(int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, daño, VA);
		arma = new ArmaJugador();
		escudo = new EscudoNormal();
		grafico = new JugadorGrafico(X, Y, alto, ancho, VM);	
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
	
	protected void serColisionado(ProyectilEnemigo p) {
		int DañoAux = escudo.recibirDaño(p);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}
	
	protected void serColisionado(EnemigoKamikaze e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}
	
	public void atacar() {
		arma.disparar(dañoAtaque, velocidadDeAtaque);
	}

	public void mover(char c) {
		if (c=='a')
			pos.moverX(-velocidadDeMovimiento);
		if (c=='d')
			pos.moverX(velocidadDeMovimiento);
		grafico.mover(c);
	}
	
	private void controlarEscudo() {
		if (escudo.getDuracion()==0)
			escudo = new EscudoNormal();
	}
}
