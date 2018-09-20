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
		try {
			Entidad[] aux;
			while (true) {
				aux = new Entidad[coleccion.size()];
				coleccion.toArray(aux);
				for(int i=0; i<aux.length; i++) {
					aux[i].getGrafico().actualizar();
				}
				Thread.sleep(5);
			// catch (InterruptedException e) {
			}
		} catch (InterruptedException e) {}
		catch (NullPointerException e) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			run();
		}
	}
}
