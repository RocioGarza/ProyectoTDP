package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;
import jugador.*;

public class EscudoTotal extends Escudo{
	
	private Jugador jug;
	private VidaEscudoTotal vida;

	public EscudoTotal(Jugador j) {
		jug = j;
		vida = new VidaEscudoTotal(this);
		iniciarHilo();
		
	}

	private void iniciarHilo() {
		vida.start();		
	}
	
	public int recibirDaño(Proyectil e) {	
		return 0;		
	}

	public int recibirDaño(Enemigo e) {
		return 0;
	}

	public void cambiarEscudoNormal() {
		jug.setEscudo(new EscudoNormal(jug));
	}

	public void cambiarKamikaze() {
		System.out.println("Se cambio a kamikaze");
		jug.setEscudo(new EscudoAntiKamikaze(jug));
	}

	public void cambiarEscudoTotal() {}

	public int getDuracion() {
		return duracion;
	}
}
