package premio;

import jugador.Jugador;

public class BuffAtaque extends Thread{

	private Jugador jugador;
	
	public BuffAtaque(Jugador j) {
		jugador=j;
	}
	
	public void run() {
		int mejoraDa�o = jugador.getDa�o()/2;
		jugador.modificarDa�o(mejoraDa�o);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jugador.modificarDa�o(-mejoraDa�o);
	}
}
