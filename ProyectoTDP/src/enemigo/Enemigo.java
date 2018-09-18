package enemigo;

import elemento.PosicionMaxima;
import entidad.Personaje;

public abstract class Enemigo extends Personaje {
	
	//protected Inteligencia intel; 
	
	public class Hilo extends Thread{
		public void run(){
			//mover el objeto de una pared a la otra sin parar
			while(true){

				//avanza a la derecha hasta chocar con la pared
				while(getPosicion().getX() < PosicionMaxima.getX()){
					getPosicion().moverX( 1 );
					getGrafico().mover('d');
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

				//avanza a la izquierda hasta chocar con la pared
				while(getPosicion().getX() > 0){
					getPosicion().moverX( -1 );
					getGrafico().mover('a');
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public Enemigo (int X, int Y, int alto, int ancho) {
		super(X, Y, alto, ancho);	
		Hilo h = new Hilo();
		h.start();
		
	}
	

}
