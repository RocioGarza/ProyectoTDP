package premio;

import jugador.Jugador;

public class BuffAtaque extends Thread{

	private Jugador jugador;
	
	public BuffAtaque(Jugador j) {
		jugador=j;
	}
	
	public void run() {
		int mejoraDaño = jugador.getDaño()/2;
		jugador.modificarDaño(mejoraDaño);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jugador.modificarDaño(-mejoraDaño);
	}
}
