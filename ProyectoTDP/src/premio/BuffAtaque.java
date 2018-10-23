package premio;

import jugador.Jugador;

public class BuffAtaque extends Thread{

	private Jugador jugador;
	
	public BuffAtaque(Jugador j) {
		jugador=j;
	}
	
	public void run() {
		int mejoraDaņo = jugador.getDaņo()/2;
		jugador.modificarDaņo(mejoraDaņo);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jugador.modificarDaņo(-mejoraDaņo);
	}
}
