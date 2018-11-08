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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarKamikaze() {
		// TODO Auto-generated method stub
		
	}
}
