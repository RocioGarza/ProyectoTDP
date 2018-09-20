package logica;

import java.util.Collection;

import entidad.Entidad;

public class Reloj extends Thread{
	
	private Collection<Entidad> coleccion;
	private Mapa mapa;
	
	public Reloj(Mapa mapa) {
		this.mapa = mapa;
		coleccion = mapa.getColeccion();
	}
	
	public void run() {
		while(true) {
			mover();
			controlarColisiones();
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void mover() {
		Entidad[] aux;
		aux = new Entidad[coleccion.size()];
		coleccion.toArray(aux);
		for(int i=0; i<aux.length; i++) 
			aux[i].mover();
	}

	public void controlarColisiones() {
		Entidad[] aux;
		int i1;
		int i2;
		boolean colicione;
		
		int size=coleccion.size();
		aux = new Entidad[size+10];
		coleccion.toArray(aux);
		i1=0;
		i2=i1+1;
		colicione=false;
		
		while(i1 < size) {
			while(i2<size) {
				colicione = mapa.colision(aux[i1], aux[i2]);
				if(colicione) {
					if(!aux[i1].estaViva()) 
						mapa.remover(aux[i1]);
					if(i2<aux.length && !aux[i2].estaViva()) 
						mapa.remover(aux[i2]);
				}
				i2++;
				colicione=false;
			}
			i1++;
			i2=i1+1;
		} 
	}
}