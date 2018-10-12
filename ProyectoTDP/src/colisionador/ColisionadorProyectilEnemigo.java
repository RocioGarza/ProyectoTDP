package colisionador;

import jugador.Jugador;
import obstaculo.Pared;
import proyectil.Proyectil;

public class ColisionadorProyectilEnemigo extends ColisionadorProyectil{

	public ColisionadorProyectilEnemigo(Proyectil p) {
		proyectil = p;
	}
	
	public void serChocado(Jugador e) {
		e.quitarVida(proyectil.getDaño());
	}
	
	public void serChocado(Pared e) {
		e.quitarVida(proyectil.getDaño());
	}
}
