package proyectil;

import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import entidad.Entidad;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;

public class ProyectilJugador extends Proyectil{
	
	private ProyectilJugadorGrafico grafico;

	public ProyectilJugador(int X, int Y, int VM, int daño) {
		super(X,Y,VM,daño);
		vida=1;
		grafico = new ProyectilJugadorGrafico(pos);
	}

	public ProyectilJugadorGrafico getGrafico() {
		return grafico;
	}
	
	public void chocar(Entidad e) {
		e.serChocado(this);
	}
	
	public void serChocado(Alpha e) {
		e.quitarVida(10000);
	}

	public void serChocado(Beta e) {
		e.quitarVida(10000);
	}

	public void serChocado(Gamma e) {
		e.quitarVida(10000);
	}

	public void serChocado(Delta e) {
		e.quitarVida(10000);
	}

	public void serChocado(Iota e) {
		e.quitarVida(10000);
	}

	public void serChocado(Irrompible e) {
		e.quitarVida(10000);
	}

	public void serChocado(Pared e) {
		e.quitarVida(10000);
	}

	public void serChocado(ParedJugador e) {
		e.quitarVida(10000);
	}

	public void serChocado(Portal e) {
		e.quitarVida(10000);
	}

	public void serChocado(Rebote e) {
		e.quitarVida(10000);
	}

}
