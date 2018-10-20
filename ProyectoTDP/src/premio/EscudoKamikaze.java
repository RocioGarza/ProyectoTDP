package premio;

import entidad.Entidad;
import entidad.Posicion;

public class EscudoKamikaze extends ObjetoPrecioso{

	private EscudoKamikazeGrafico grafico;
	
	public EscudoKamikaze(int X, int Y) {
		super(X, Y, 59, 66);
		grafico = new EscudoKamikazeGrafico(pos);
	}

	@Override
	public EscudoKamikazeGrafico getGrafico() {
		return grafico;
	}
	
	public void mover() {
		pos.moverY(velocidadDeMovimiento);
		if(pos.getY()==0 || pos.getY()==Posicion.getYmax())
			vida=0;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {}

}
