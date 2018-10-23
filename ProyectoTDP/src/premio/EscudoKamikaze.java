package premio;

import colisionador.ColisionadorEscudoKamikaze;
import entidad.Entidad;
import entidad.Posicion;

public class EscudoKamikaze extends ObjetoPrecioso{

	private EscudoKamikazeGrafico grafico;
	
	public EscudoKamikaze(int X, int Y) {
		super(X, Y, 59, 66);
		puntaje = 10;
		grafico = new EscudoKamikazeGrafico(pos);
		colisionador = new ColisionadorEscudoKamikaze();
	}

	@Override
	public EscudoKamikazeGrafico getGrafico() {
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
