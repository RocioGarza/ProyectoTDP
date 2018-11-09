package proyectil;

import EntidadGrafica.ProyectilEnemigoGrafico;
import EntidadGrafica.ProyectilLanzaDerechaGrafica;
import colisionador.ColisionadorProyectilEnemigo;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilLanzaDerecha extends ProyectilEnemigo{

	private ProyectilLanzaDerechaGrafica grafico;
	
	public ProyectilLanzaDerecha(int X, int Y, int daño, int VM) {
		super(X, Y, 33, 33, daño, VM);
		
		vida=1;
		
		grafico = new ProyectilLanzaDerechaGrafica(pos);
		colisionador = new ColisionadorProyectilEnemigo(this);
	}

	public ProyectilEnemigoGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		pos.moverX(velocidadDeMovimiento);
		pos.moverY(velocidadDeMovimiento);
		if(pos.getY() == 0 || pos.getY()+pos.getAlto() == Posicion.getYmax() || pos.getX() == 0 || pos.getX()+pos.getAncho() == Posicion.getXmax())
			vida=0;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
