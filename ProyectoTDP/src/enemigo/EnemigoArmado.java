package enemigo;

public abstract class EnemigoArmado extends Enemigo{

	public EnemigoArmado (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida, int daño, int VA) {
		super(X, Y, alto, ancho, VM, vidaM, vida, daño, VA);	
	}
}
