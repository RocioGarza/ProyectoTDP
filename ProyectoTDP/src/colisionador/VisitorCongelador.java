package colisionador;

import java.util.Map;

import enemigo.Alpha;
import enemigo.Beta;
import enemigo.Delta;
import enemigo.Gamma;
import enemigo.IA_Nula;
import enemigo.Inteligencia;
import enemigo.Iota;
import enemigo.Strelitzia;
import entidad.Entidad;
import jugador.Jugador;
import obstaculo.Irrompible;
import obstaculo.Pared;
import obstaculo.ParedJugador;
import obstaculo.Portal;
import obstaculo.Rebote;
import premio.Cohete;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.Pocion;
import proyectil.BuscadorObjetivo;
import proyectil.ProyectilEnemigo;
import proyectil.ProyectilJugador;

public class VisitorCongelador extends Colisionador{

	private Map<Entidad,Inteligencia> mapeoInteligencias;
	
	public VisitorCongelador(Map<Entidad,Inteligencia> mapeoInteligencias) {
		this.mapeoInteligencias = mapeoInteligencias;
	}
	
	public void serChocado(Alpha e) {
		mapeoInteligencias.put(e,e.getInteligencia());
		e.setInteligencia(new IA_Nula(e));
	}

	public void serChocado(Beta e) {
		mapeoInteligencias.put(e,e.getInteligencia());
		e.setInteligencia(new IA_Nula(e));
	}

	public void serChocado(Gamma e) {
		mapeoInteligencias.put(e,e.getInteligencia());
		e.setInteligencia(new IA_Nula(e));
	}

	public void serChocado(Delta e) {
		mapeoInteligencias.put(e,e.getInteligencia());
		e.setInteligencia(new IA_Nula(e));
	}

	public void serChocado(Iota e) {
		mapeoInteligencias.put(e,e.getInteligencia());
		e.setInteligencia(new IA_Nula(e));
	}
	
	public void serChocado(Strelitzia e) {
		mapeoInteligencias.put(e,e.getInteligencia());
		e.setInteligencia(new IA_Nula(e));
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

	public void serChocado(Cohete e) {}

	public void serChocado(Pocion e) {}
	
	public void serChocado(ProyectilJugador e) {}
	
	public void serChocado(ProyectilEnemigo e) {}
	
	public void serChocado(BuscadorObjetivo e) {}
}
