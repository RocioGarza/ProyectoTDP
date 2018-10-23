package enemigo;

public class IA_Nula extends Inteligencia{

	private Enemigo enemigo;
	
	public IA_Nula(Enemigo e) {
		enemigo = e;
	}
	
	public void mover() {
		enemigo.getGrafico().changeIcon('s');
	}
}
