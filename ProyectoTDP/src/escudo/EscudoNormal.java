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
	
	public int recibirDa�o(Proyectil e) {
		return e.getDa�o();
	}
	
	public int recibirDa�o(Enemigo e) {
		return e.getDa�o();
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
