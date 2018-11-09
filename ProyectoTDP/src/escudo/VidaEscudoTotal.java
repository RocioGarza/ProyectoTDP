package escudo;

public class VidaEscudoTotal extends Thread{
	private long tiempoInicial;
	private Escudo esc;
	
	public VidaEscudoTotal(Escudo e) {
		tiempoInicial = System.currentTimeMillis();
		esc = e;
	}
	
	public void run() {
		
		boolean stop = false;
		while(!stop) {
			if(System.currentTimeMillis() - tiempoInicial >= 5000) {// Se termino el efecto del escudo
				stop = true;
				esc.cambiarEscudoNormal();
			}
		}
	}
	
}
