package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;
import jugador.*;

//Permite que pasen todos los ataques
public class EscudoNormal extends Escudo {
	
	public EscudoNormal (Jugador j) {
		jug = j;
		duracion = 1;
	}
	
	public int recibirDaño(Proyectil e) {
		return e.getDaño();
	}
	
	public int recibirDaño(Enemigo e) {
		return e.getDaño();
	}
	
	public int getDuracion() {
		return duracion;
	}

	@Override
	public void cambiarEscudoNormal() {	}

	@Override
	public void cambiarEscudoTotal() {
		
	}

	@Override
	public void cambiarKamikaze() {
		jug.setEscudo(new EscudoAntiKamikaze(jug));
	}
}
