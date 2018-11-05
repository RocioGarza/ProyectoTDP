package proyectil;

import EntidadGrafica.ProyectilEnemigoGrafico;
import colisionador.ColisionadorProyectilEnemigo;
import entidad.Entidad;
import entidad.Posicion;


public class ProyectilEnemigo extends Proyectil{
	
	private ProyectilEnemigoGrafico grafico;
	
	public ProyectilEnemigo(int X, int Y, int da�o, int VM) {
		super(X,Y,22,15,da�o,VM);
		vida=1;
		
		grafico = new ProyectilEnemigoGrafico(pos);
		colisionador = new ColisionadorProyectilEnemigo(this);
	}

	public ProyectilEnemigoGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		pos.moverY(velocidadDeMovimiento);
		if(pos.getY() == 0 || pos.getY()+pos.getAlto() == Posicion.getYmax())
			vida=0;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
