package elemento;


public abstract class Elemento {

	protected int velocidadDeMovimiento;
	protected Posicion pos;
	
	public Elemento(int X, int Y, int alto, int ancho) {
		pos = new Posicion(X,Y,alto,ancho);
	}
	
	public void Colisionar(Elemento e) {
		e.serColisionado(this);
	}
	
	protected void serColisionado(Elemento e) {}
	
	public Posicion getPosicion() {
		return pos;
	}
	
	public abstract void mover(char c) ;

	public abstract ElementoGrafico getGrafico();
	
}
