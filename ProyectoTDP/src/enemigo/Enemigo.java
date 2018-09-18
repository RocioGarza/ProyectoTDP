package enemigo;

import elemento.PosicionMaxima;
import entidad.Personaje;

public abstract class Enemigo extends Personaje {
	
	//protected Inteligencia intel; 
	
	public class Hilo extends Thread{
		public void run(){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//mover el objeto de una pared a la otra sin parar
			while(true){

				//avanza a la derecha hasta chocar con la pared
				while(getPosicion().getX() < PosicionMaxima.getX()-getPosicion().getAncho()-1){
					getPosicion().moverX( 1 );
					getGrafico().mover('d');
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

				//avanza a la izquierda hasta chocar con la pared
				while(getPosicion().getX() > getPosicion().getAncho()+1){
					getPosicion().moverX( -1 );
					getGrafico().mover('a');
					try {
						Thread.sleep(10);
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
