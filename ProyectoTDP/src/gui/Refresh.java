package gui;

import java.util.Collection;

import entidad.Entidad;
import logica.Mapa;

public class Refresh extends Thread{
	
private Collection<Entidad> coleccion;
	
	public Refresh(Mapa mapa) {
		coleccion = mapa.getColeccion();
	}

	public void run() {
		Entidad[] aux;
		while (true) {
			//System.out.println(coleccion.size());
			aux = new Entidad[coleccion.size()];
			coleccion.toArray(aux);
			for(int i=0; i<aux.length; i++) {
				//System.out.println(e);
				aux[i].getGrafico().actualizar();
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
