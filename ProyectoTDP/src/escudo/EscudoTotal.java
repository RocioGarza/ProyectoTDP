package escudo;

import enemigo.Enemigo;
import proyectil.Proyectil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import jugador.*;

public class EscudoTotal extends Escudo{
	private Timer tiempo;
	Jugador jug;
	
	public EscudoTotal(Jugador j) {
		jug = j;
		duracion = 0; 
		tiempo = new Timer(1000, escudoActivado);
		tiempo.start();
	}
	
	private ActionListener escudoActivado = new ActionListener() {//Controla el tiempo disponible del escudo
		public void actionPerformed(ActionEvent e) {
			duracion++;
			if(duracion == 30) {
				tiempo.stop();
				cambiarEscudoNormal();
			}
				
		}
	};
	
	public int recibirDaño(Proyectil e) {	
		if(duracion == 30) {//Se termino el efecto del escudo
			
			return e.getDaño();
		}else
			return 0;		
	}
	
	
	public int recibirDaño(Enemigo e) {
		if(duracion == 30) {//Se termino el efecto del escudo
			
			return e.getDaño();
		}else
			return 0;
	}
	
	public void cambiarEscudoNormal() {
		jug.setEscudo(new EscudoNormal(jug));
	}
	
	public void cambiarKamikaze() {
		jug.setEscudo(new EscudoAntiKamikaze(jug));
	}
	
	public void cambiarEscudoTotal() {}
	
	public int getDuracion() {
		return duracion;
	}
}
