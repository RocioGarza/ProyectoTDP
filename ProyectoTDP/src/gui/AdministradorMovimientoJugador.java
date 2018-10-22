/*package gui;


import jugador.Jugador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
	
public class AdministradorMovimientoJugador extends Thread{
	
	private Map<String,Character> mapeoInputs;
	private Jugador j;
	private Oyente o;
	
	public AdministradorMovimientoJugador(Jugador j,Map<String,Character> mapeo)
	{
		this.mapeoInputs=mapeo;
		o= new Oyente();
		
		mapeoInputs = new HashMap<String,Character>();
		mapeoInputs.put("Movimiento",'x');
		mapeoInputs.put("Disparo",'x');
		mapeoInputs.put("CambiarArma",'x');
		
		this.j=j;
		
	}
	
	public Oyente getOyente()
	{
		return o;
	}

	public void run() {
		while(true)
		{
			moverJugador();
			refresh();
			try {
				Thread.sleep(8);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void moverJugador() {
		j.mover(mapeoInputs.get("Movimiento"));
		if(mapeoInputs.get("CambiarArma")=='l') {
			j.cambiarArma();
			mapeoInputs.put("CambiarArma", 'x');
		}
		j.disparar(mapeoInputs.get("Disparo"));
	}
	
	private void refresh()
	{
		j.getGrafico().actualizar();
	}
	
	public class Oyente implements KeyListener {
				
		public void keyPressed(KeyEvent key) {
			if(key.getKeyChar() == 'a') {
				j.mover('a');
				mapeoInputs.put("Movimiento", 'a');
				System.out.println("A");
			}
			else
				if(key.getKeyChar() == 'd')
					mapeoInputs.put("Movimiento", 'd');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", ' ');
			if(key.getKeyChar() == 'l')
				mapeoInputs.put("CambiarArma", 'l');
		}

		public void keyReleased(KeyEvent key) {
			if(key.getKeyChar() == 'a') {
				mapeoInputs.put("Movimiento", 'x');
				System.out.println("A");
			}
			else
				if(key.getKeyChar() == 'd')
					mapeoInputs.put("Movimiento", 'x');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", 'x');
		}

		public void keyTyped(KeyEvent key) { }		
	}
}
*/