package logica;

import java.util.Collection;

import entidad.Entidad;

public class Reloj extends Thread{
	
	private Collection<Entidad> coleccion;
	
	public Reloj(Mapa mapa) {
		coleccion = mapa.getColeccion();
	}
	
	public void run() {
		while (true) {
			for(Entidad e : coleccion)
				e.mover();
			
			try {
				Thread.sleep(8);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
