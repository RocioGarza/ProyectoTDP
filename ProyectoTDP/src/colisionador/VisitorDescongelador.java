package colisionador;

import java.util.Map;

import Inteligencia.InteligenciaEnemigo;
import enemigo.Alpha;
import enemigo.AnomaliaTemporal;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.Iota;
import enemigo.Strelitzia;
import entidad.Entidad;
import jugador.Jugador;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import premio.Cohete;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.Pocion;
import proyectil.BuscadorObjetivo;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class VisitorDescongelador extends Colisionador{

private Map<Entidad,InteligenciaEnemigo> mapeoInteligencias;
	
	public VisitorDescongelador(Map<Entidad,InteligenciaEnemigo> mapeoInteligencias) {
		this.mapeoInteligencias = mapeoInteligencias;
	}
	
	public void serChocado(Alpha e) {
		e.setInteligencia(mapeoInteligencias.get(e));
		e.getGrafico().changeIcon('w');
	}

	public void serChocado(Beta e) {
		e.setInteligencia(mapeoInteligencias.get(e));
		e.getGrafico().changeIcon('w');
	}

	public void serChocado(Gamma e) {
		e.setInteligencia(mapeoInteligencias.get(e));
		e.getGrafico().changeIcon('w');
	}

	public void serChocado(Delta e) {
		e.setInteligencia(mapeoInteligencias.get(e));
		e.getGrafico().changeIcon('w');
	}

	public void serChocado(Iota e) {
		e.setInteligencia(mapeoInteligencias.get(e));
		e.getGrafico().changeIcon('w');
	}
	
	public void serChocado(Strelitzia e) {
		e.setInteligencia(mapeoInteligencias.get(e));
		e.getGrafico().changeIcon('w');
	}
	
	public void serChocado(AnomaliaTemporal e) {}
	
	public void serChocado(Jugador e) {}

	public void serChocado(Irrompible e) {}

	public void serChocado(Pared e) {}

	public void serChocado(ParedJugador e) {}

	public void serChocado(Portal e) {}

	public void serChocado(CongelarEnemigos e) {}

	public void serChocado(EscudoKamikaze e) {}

	public void serChocado(MasAtaques e) {}

	public void serChocado(MejoraAtaque e) {}

	public void serChocado(Cohete e) {}

	public void serChocado(Pocion e) {}
	
	public void serChocado(ProyectilJugador e) {}
	
	public void serChocado(ProyectilEnemigo e) {}
	
	public void serChocado(BuscadorObjetivo e) {}
}
