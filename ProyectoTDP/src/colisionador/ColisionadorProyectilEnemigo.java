package colisionador;

import jugador.Jugador;
import obstaculo.Pared;
import proyectil.BuscadorObjetivo;
import proyectil.Proyectil;

public class ColisionadorProyectilEnemigo extends ColisionadorProyectil{

	public ColisionadorProyectilEnemigo(Proyectil p) {
		proyectil = p;
	}
	
	public void serChocado(Jugador e) {
		int n = e.getEscudo().recibirDaño(proyectil); // el escudo determina si absorber el impacto o pasarlo al jugador
		e.quitarVida(n);
	}
	
	public void serChocado(Pared e) {
		e.quitarVida(proyectil.getDaño());
	}
	
	public void serChocado(BuscadorObjetivo e) {}
}
