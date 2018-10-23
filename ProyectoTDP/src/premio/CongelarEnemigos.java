package premio;

import colisionador.ColisionadorCongelarEnemigos;
import entidad.Entidad;
import entidad.Posicion;


public class CongelarEnemigos extends MagiaTemporal{

	private CongelarEnemigosGrafico grafico;
	
	public CongelarEnemigos(int X, int Y) {
		super(X, Y, 59, 66);
		puntaje = 10;
		grafico = new CongelarEnemigosGrafico(pos);
		colisionador = new ColisionadorCongelarEnemigos();
	}

	@Override
	public CongelarEnemigosGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		if(pos.getY()+pos.getAlto() >= Posicion.getYmax()-100)
			vida--;
		else
			pos.moverY(velocidadDeMovimiento);
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}
}
