package logica;

import java.util.Collection;

import entidad.Entidad;

public class Reloj extends Thread{
	
	private Collection<Entidad> coleccion;
	
	public Reloj(Mapa mapa) {
		coleccion = mapa.getColeccion();
	}
	
	public void run() {
		Entidad[] aux;
		while (true) {
			aux = new Entidad[coleccion.size()];
			coleccion.toArray(aux);
			for(int i=0; i<aux.length; i++) 
				aux[i].mover();
			
			try {
				Thread.sleep(8);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}

