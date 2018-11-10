package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

//Permite que pasen todos los ataques
public class EscudoNormal extends Escudo {
	
	public EscudoNormal () {
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
}