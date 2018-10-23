package enemigo;

import java.util.Random;

import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import logica.Entorno;
import logica.Mapa;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.Cohete;
import premio.Pocion;
import proyectil.Proyectil;

public class Beta extends EnemigoKamikaze{
	
	private BetaGrafico grafico;

	public Beta (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		vidaMaxima = 25;
		vida=vidaMaxima;
		dañoAtaque = 25;
		dañoImpacto = dañoAtaque*10;
		inteligencia = new IA_Kamikaze(this);
		grafico = new BetaGrafico(pos);
		puntaje=15;
		colisionador = new ColisionadorEnemigos(this);
	}
	
	public static int getAlto() {
		return 56;
	}
	
	public static int getAncho() {
		return 134;
	}
	
	public void atacar() {
		grafico.changeIcon(' ');
		inteligencia = new IA_KamikazeAtaque(this);
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public void terminarAtaque() {
		grafico.changeIcon('w');
		inteligencia = new IA_Kamikaze(this);
	}
	
	public BetaGrafico getGrafico() {
		return grafico;
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public void morir() {
		Random r = new Random();
		int aux = r.nextInt(100);
		if(aux<2)
			Entorno.getEntorno().agregarEntidad(new CongelarEnemigos((pos.getX()+getAncho()/2),pos.getY()+getAlto()));
		else
			if(aux<4)
				Entorno.getEntorno().agregarEntidad(new EscudoKamikaze((pos.getX()+getAncho()/2),pos.getY()+getAlto()));
			else
				if(aux<8)
					Entorno.getEntorno().agregarEntidad(new MejoraAtaque((pos.getX()+getAncho()/2),pos.getY()+getAlto()));
				else
					if(aux<10)
						Entorno.getEntorno().agregarEntidad(new MasAtaques((pos.getX()+getAncho()/2),pos.getY()+getAlto()));
					else
						if(aux<12)
							Entorno.getEntorno().agregarEntidad(new Cohete((pos.getX()+getAncho()/2),pos.getY()+getAlto()));
						else
							if(aux<18)
								Entorno.getEntorno().agregarEntidad(new Pocion((pos.getX()+getAncho()/2),pos.getY()+getAlto()));
		
		Entorno.getEntorno().reducirEnemigos();
	}
}
