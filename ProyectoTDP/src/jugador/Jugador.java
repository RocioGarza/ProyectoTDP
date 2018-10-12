package jugador;

import java.util.HashMap;
import java.util.Map;

import arma.Arma;
import arma.ArmaJugador;
import colisionador.ColisionadorJugador;
import entidad.Entidad;
import entidad.Personaje;
import escudo.Escudo;
import escudo.EscudoAntiKamikaze;
import escudo.EscudoNormal;
import extra.Contador;
import proyectil.Proyectil;

public class Jugador extends Personaje{

	private Arma arma;
	private Escudo escudo;
	private JugadorGrafico grafico;
	private Map<String,Character> inputs;
	private Contador contador;
	
	public Jugador(int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 5;
		velocidadDeAtaque = 5;
		vidaMaxima = 100;
		vida = vidaMaxima;
		dañoAtaque = 5;
		arma = new ArmaJugador(pos);
		escudo = new EscudoNormal();
		grafico = new JugadorGrafico(pos);	
		colisionador = new ColisionadorJugador();
		inputs = new HashMap<String,Character>();
		inputs.put("Movimiento", 'x');
		inputs.put("Disparo", 'x');
		contador = new Contador();
	}
	
	public static int getAlto() {
		return 160;
	}
	
	public static int getAncho() {
		return 190;
	}
	
	public void setArma(char c) {
		//Requisito: c debe ser un caracter valido asociado a un arma
	}
	
	public void setEscudo(char c) {
		//Requisito: c debe ser un caracter valido asociado a un escudo
		if (c=='n') 
			escudo = new EscudoNormal();
		else
			if (c=='k')
				escudo = new EscudoAntiKamikaze();
	}
	
	protected void morir() {
		//hacer algo
	}
	
	public Proyectil mover() {
		mover(inputs.get("Movimiento"));
		return disparar(inputs.get("Disparo"));
	}
	
	public void mover(char c) {
		if (c=='a')
			pos.moverX(-velocidadDeMovimiento);
		else
			if (c=='d')
				pos.moverX(velocidadDeMovimiento);
	}
	
	public Proyectil disparar(char c) {
		if (c==' ' && contador.disponible()) {
			contador.iniciar(0);
			return arma.disparar(dañoAtaque, velocidadDeAtaque);
		}
		else {
			contador.decrementarContador();
			return null;
		}
	}

	public void agregarInput(char c) {
		if(c=='d')
			inputs.put("Movimiento", 'd');
		if(c=='a')
			inputs.put("Movimiento", 'a'); 
		
		if(c==' ')
			inputs.put("Disparo", ' ');
	}
	
	public void quitarInput(char c) {
		if(c=='d')
			inputs.put("Movimiento", 'x');
		if(c=='a')
			inputs.put("Movimiento", 'x'); 
		
		if(c==' ')
			inputs.put("Disparo", 'x');
	}
	
	/*private void controlarEscudo() {
		if (escudo.getDuracion()==0)
			escudo = new EscudoNormal();
	}*/
	
	public JugadorGrafico getGrafico() {
		return grafico;
	}

	public Proyectil atacar() {
		return null;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
}
