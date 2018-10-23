package proyectil;

import colisionador.ColisionadorProyectilJugador;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilJugadorCohete extends ProyectilJugador{
	
	private ProyectilJugadorGrafico grafico;
	private long tiempoDisparo;
	private long incrementarVel;
	
	public ProyectilJugadorCohete(int X, int Y, int daño) {
		super(X,Y,64,24,daño*10,1);
		vida=1;
		grafico = new ProyectilJugadorCoheteGrafico(pos);
		colisionador = new ColisionadorProyectilJugador(this);
		tiempoDisparo = System.currentTimeMillis();
		incrementarVel = -1000;
	}

	public ProyectilJugadorGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		if(System.currentTimeMillis()-tiempoDisparo>250) {
			pos.moverY(-velocidadDeMovimiento);
			if(System.currentTimeMillis()-incrementarVel>500 && velocidadDeMovimiento<10) {
				incrementarVel=System.currentTimeMillis();
				velocidadDeMovimiento=velocidadDeMovimiento+(1+velocidadDeMovimiento/2);
			}
			
			if(velocidadDeMovimiento>6)
				grafico.changeIcon(' ');
			else
				if(velocidadDeMovimiento>4)
					grafico.changeIcon('a');
				else
					if(velocidadDeMovimiento>2)
						grafico.changeIcon('d');
					else
						if(velocidadDeMovimiento>0)
							grafico.changeIcon('s');
			
			if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
				vida=0;
		}
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}

}