package premio;

import colisionador.ColisionadorMejoraAtaque;
import entidad.Entidad;
import entidad.Posicion;

public class MejoraAtaque extends MagiaTemporal{
	
	private MejoraAtaqueGrafica grafico;

	public MejoraAtaque(int X, int Y) {
		super(X, Y, 59, 66);
		puntaje = 10;
		grafico = new MejoraAtaqueGrafica(pos);
		colisionador = new ColisionadorMejoraAtaque();
	}

	@Override
	public MejoraAtaqueGrafica getGrafico() {
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
