package proyectil;

import EntidadGrafica.ProyectilEnemigoGrafico;
import EntidadGrafica.ProyectilLanzaIzquierdaGrafica;
import colisionador.ColisionadorProyectilEnemigo;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilLanzaIzquierda extends ProyectilEnemigo{
	
	private ProyectilLanzaIzquierdaGrafica grafico;

	public ProyectilLanzaIzquierda(int X, int Y, int daño, int VM) {
		super(X, Y, 33, 33, daño, VM);
		
		vida=1;
		
		grafico = new ProyectilLanzaIzquierdaGrafica(pos);
		colisionador = new ColisionadorProyectilEnemigo(this);
	}

	public ProyectilEnemigoGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		pos.moverX(-velocidadDeMovimiento);
		pos.moverY(velocidadDeMovimiento);
		if(pos.getY() == 0 || pos.getY()+pos.getAlto() == Posicion.getYmax() || pos.getX() == 0 || pos.getX()+pos.getAncho() == Posicion.getXmax())
			vida=0;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
