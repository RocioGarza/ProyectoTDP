package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

//Permite que pasen todos los ataques
public class EscudoNormal extends Escudo {
	
	public EscudoNormal () {
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
}