package entidad;

import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import jugador.Jugador;
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
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public abstract class Entidad {

	protected int velocidadDeMovimiento;
	protected Posicion pos;
	protected int vidaMaxima;
	protected int vida;
	
	public Entidad(int X, int Y, int alto, int ancho) {
		pos = new Posicion(X,Y,alto,ancho);
		vidaMaxima=1000;
		vida=1000;
	}
	
	public Posicion getPosicion() {
		return pos;
	}
	
	public int getVelocidadDeMovimiento() {
		return velocidadDeMovimiento;
	}
	
	public void mover() {}

	public abstract EntidadGrafica getGrafico();
	
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void recargarVida() {
		vida = vidaMaxima;
	}
	
	public void quitarVida(int v) {
		if (vida-v <= 0)
			this.morir();
		else
			vida = vida - v;
	}
	
	public void curar(int v) {
		if (vida+v>vidaMaxima)
			vida = vidaMaxima;
		else
			vida = vida + v;
	}
	
	protected void morir() {
		//hacer
	}
	
	public void aumentarVelocidadDeMovimiento(int vel) {
		velocidadDeMovimiento = velocidadDeMovimiento + vel;
	}
	
	public void quitarVelocidadDeMovimiento(int vel) {
		if (velocidadDeMovimiento-vel<0)
			velocidadDeMovimiento = 0;
		else
			velocidadDeMovimiento = velocidadDeMovimiento - vel;
	}
	
	public boolean estaViva() {
		return vida>0;
	}
	
	public void chocar(Entidad e) {}
		
	public void serChocado(Alpha e) {}

	public void serChocado(Beta e) {}

	public void serChocado(Gamma e) {}

	public void serChocado(Delta e) {}

	public void serChocado(Iota e) {}

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
	
	public void serChocado(ProyectilEnemigo e) {}

}
