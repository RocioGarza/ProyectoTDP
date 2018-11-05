package Inteligencia;

import enemigo.Enemigo;

public class IA_Nula extends InteligenciaEnemigo{

	private Enemigo enemigo;
	
	public IA_Nula(Enemigo e) {
		enemigo = e;
	}
	
	public void mover() {
		enemigo.getGrafico().changeIcon('s');
	}
}
