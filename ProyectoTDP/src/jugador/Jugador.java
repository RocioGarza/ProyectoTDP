package jugador;

import arma.Arma;
import arma.ArmaJugador;
import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Gamma;
import enemigo.Iota;
import entidad.Personaje;
import escudo.Escudo;
import escudo.EscudoAntiKamikaze;
import escudo.EscudoNormal;
import proyectil.Proyectil;
import proyectil.ProyectilEnemigo;

public class Jugador extends Personaje{

	private Arma arma;
	private Escudo escudo;
	private JugadorGrafico grafico;
	
	public Jugador(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 20;
		velocidadDeAtaque = 5;
		vidaMaxima = 250;
		dañoAtaque = 5;
		vida = vidaMaxima;
		arma = new ArmaJugador(pos);
		escudo = new EscudoNormal();
		grafico = new JugadorGrafico(pos);	
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
	
	public Proyectil atacarJugador() {
		return arma.disparar(dañoAtaque, velocidadDeAtaque);
	}

	public void mover(char c) {
		if (c=='a') {
			pos.moverX(-velocidadDeMovimiento);
		} else
			if (c=='d') {
				pos.moverX(velocidadDeMovimiento);
			}
	}
	
	private void controlarEscudo() {
		if (escudo.getDuracion()==0)
			escudo = new EscudoNormal();
	}
	
	public JugadorGrafico getGrafico() {
		return grafico;
	}

	public void atacar() {
		// TODO Auto-generated method stub
		
	}
	
	//Colisiones

	public void serChocado(Alpha e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}

	public void serChocado(Beta e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}

	public void serChocado(Gamma e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}

	public void serChocado(Iota e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}

		public void serChocado(ProyectilEnemigo e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}
}
