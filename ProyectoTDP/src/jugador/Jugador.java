package jugador;

import Visitor.Visitor;
import arma.Arma;
import arma.ArmaJugador;
import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.EnemigoKamikaze;
import enemigo.Gamma;
import enemigo.Iota;
import entidad.Personaje;
import escudo.Escudo;
import escudo.EscudoAntiKamikaze;
import escudo.EscudoNormal;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.OndaExpansiva;
import premio.Pocion;
import proyectil.Proyectil;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class Jugador extends Personaje implements Visitor{

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

	public void serChocado(Delta e) {}

	public void serChocado(Iota e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}

	public void serChocado(Jugador e) {}

	public void serChocado(Irrompible e) {}

	public void serChocado(Pared e) {}

	public void serChocado(ParedJugador e) {}

	public void serChocado(Portal e) {}

	public void serChocado(Rebote e) {}

	public void serChocado(CongelarEnemigos e) {}

	public void serChocado(EscudoKamikaze e) {}

	public void serChocado(MasAtaques e) {}

	public void serChocado(MejoraAtaque e) {}

	public void serChocado(OndaExpansiva e) {}

	public void serChocado(Pocion e) {}
	
	public void serChocado(ProyectilJugador e) {}

	public void serChocado(ProyectilEnemigo e) {
		int DañoAux = escudo.recibirDaño(e);
		controlarEscudo();
		if (vida-DañoAux<=0)
			morir();
		else
			vida = vida - DañoAux;
	}
}
