package extra;

public class Contador {

	private int contador;
	private int max;
	
	public Contador(int max) {
		this.max=max;
		contador=0;
	}
	
	public int getContador() {
		return contador;
	}
	
	public void iniciar() {
		contador=1;
	}
	
	public void incrementarContador() {
		contador++;
	}
	
	public boolean disponible() {
		return contador==max || contador==0;
	}
}
