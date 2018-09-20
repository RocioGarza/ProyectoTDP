package logica;

import java.util.Collection;
import java.util.Iterator;

import entidad.Entidad;

public class ControlDeColisiones extends Thread{
	
	private Mapa mapa;
	private Collection<Entidad> coleccion;
	
	public ControlDeColisiones(Mapa mapa) {
		this.mapa=mapa;
		coleccion = mapa.getColeccion();
	}
	
	public void run() {
		Entidad[] aux;
		int i1;
		int i2;
		int size;
		boolean colicione = false;
		while (true) {
			size=coleccion.size();
			aux = new Entidad[size+10];
			coleccion.toArray(aux);
			i1=0;
			i2=i1+1;
			colicione=false;
			while(i1 < size) {
				colicione=false;
				while(!colicione && i2<size) {
					colicione = mapa.colision(aux[i1], aux[i2]);
					if (!colicione)
						i2++;
				}
				if(colicione) {
					if(!aux[i1].estaViva()) 
							mapa.remover(aux[i1]);
					if(i2<aux.length && !aux[i2].estaViva()) 
						mapa.remover(aux[i2]);
				}
				i1++;
				i2=i1+1;
			} 
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
