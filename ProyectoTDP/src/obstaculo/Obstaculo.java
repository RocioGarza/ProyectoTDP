package obstaculo;

import entidad.Entidad;

public abstract class Obstaculo extends Entidad {

	public Obstaculo (int X, int Y, int alto, int ancho, int VM, int vidaM, int vida) {
		super(X,Y,alto,ancho,VM, vidaM, vida);
	}
}
