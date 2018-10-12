package proyectil;

import colisionador.ColisionadorProyectilEnemigo;
import entidad.Entidad;
import entidad.Posicion;


public class ProyectilEnemigo extends Proyectil{
	
	private ProyectilEnemigoGrafico grafico;
	
	public ProyectilEnemigo(int X, int Y, int VM, int da�o) {
		super(X,Y,VM,da�o);
		vida=1;
		grafico = new ProyectilEnemigoGrafico(pos);
		colisionador = new ColisionadorProyectilEnemigo(this);
	}

	public ProyectilEnemigoGrafico getGrafico() {
		return grafico;
	}
	
	public Proyectil mover() {
		pos.moverY(velocidadDeMovimiento);
		if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
			vida=0;
		return null;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
