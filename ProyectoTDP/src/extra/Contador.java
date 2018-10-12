package extra;

public class Contador {

	private int contador;
	
	public Contador() {
		contador=0;
	}
	
	public int getContador() {
		return contador;
	}
	
	public void iniciar(int n) {
		contador=n;
	}
	
	public void decrementarContador() {
		if(contador>0)
			contador--;
	}
	
	public void terminar() {
		contador=0;
	}
	
	public boolean disponible() {
		return contador==0;
	}
}
