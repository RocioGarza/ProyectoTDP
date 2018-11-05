package enemigo;

import java.util.Random;

import EntidadGrafica.DeltaGrafico;
import Inteligencia.IA_Armado;
import arma.ArmaEnemigo;
import colisionador.ColisionadorEnemigos;
import entidad.Entidad;
import logica.Entorno;
import premio.Cohete;
import premio.CongelarEnemigos;
import premio.EscudoKamikaze;
import premio.MasAtaques;
import premio.MejoraAtaque;
import premio.Pocion;

public class Delta extends EnemigoArmado{
	
	private DeltaGrafico grafico;

	public Delta (int X, int Y) {
		super(X, Y, getAlto(), getAncho());
		velocidadDeMovimiento = 2;
		velocidadDeAtaque = 5;
		vidaMaxima = 150;
		vida=vidaMaxima;
		dañoAtaque = 15;
		arma = new ArmaEnemigo(pos);
		inteligencia = new IA_Armado(this);
		grafico = new DeltaGrafico(pos);
		puntaje=20;
		colisionador = new ColisionadorEnemigos(this);
	}
	
	public static int getAlto() {
		return 103;
	}
	
	public static int getAncho() {
		return 193;
	}

	public void atacar() {
		grafico.changeIcon(' ');
		arma.disparar(dañoAtaque, velocidadDeAtaque);
	}

	public void mover() {
		inteligencia.mover();
	}	
	
	public DeltaGrafico getGrafico() {
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
