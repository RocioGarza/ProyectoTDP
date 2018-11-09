package proyectil;

import EntidadGrafica.ProyectilEnemigoGrafico;
import EntidadGrafica.ProyectilLanzaCentroGrafica;
import colisionador.ColisionadorProyectilEnemigo;
import entidad.Entidad;
import entidad.Posicion;

public class ProyectilLanzaCentro extends ProyectilEnemigo{
	
	private ProyectilLanzaCentroGrafica grafico;
	
	public ProyectilLanzaCentro(int X, int Y, int daño, int VM) {
		super(X, Y, 46, 9,daño, VM);
		
		vida=1;
		
		grafico = new ProyectilLanzaCentroGrafica(pos);
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
