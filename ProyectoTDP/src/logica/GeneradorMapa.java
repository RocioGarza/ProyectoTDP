package logica;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import elemento.Elemento;
import elemento.PosicionMaxima;
import obstaculo.*;
import enemigo.*;

public class GeneradorMapa {
	
	BufferedReader arch;
	private Collection<Elemento> coleccion;
	private int x;
	private int y;
	private char c;
	private Collection<Point> ocupados;
	
	public GeneradorMapa(String txt)
	{	 
		coleccion = new LinkedList<Elemento>();
		ocupados = new LinkedList<Point>();
		try {
			arch =  new BufferedReader(new FileReader(txt));
			x=0;
			y=0;
			while(y<PosicionMaxima.getY()) {
			try {
				c =(char) arch.read();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(c!='/' && x!= PosicionMaxima.getX()) 
			{
				switch (c) {
				case 'A':
						Punto posAlpha = posicionar(Alpha.getAlto(), Alpha.getAncho());
						if(posAlpha != null)
						{
							Alpha a = new Alpha(posAlpha.getX(), posAlpha.getY());
							coleccion.add(a);
						}
						break;
				case 'B':
						Punto posBeta = posicionar(Beta.getAlto(), Beta.getAncho());
						if(posBeta != null)
						{
							Beta b = new Beta(posBeta.getX(), posBeta.getY());
							coleccion.add(b);
						}
						break;
				case 'C': 
						Punto posGamma = posicionar(Gamma.getAlto(), Gamma.getAncho());
						if(posGamma != null)
						{
							Gamma c = new Gamma(posGamma.getX(), posGamma.getY());
							coleccion.add(c);
						}
						break;
				case 'D': 
						Punto posDelta = posicionar(Delta.getAlto(), Delta.getAncho());
						if(posDelta != null)
						{
							Delta d = new Delta(posDelta.getX(), posDelta.getY());
							coleccion.add(d);
						}
						break;
				case 'E': 
						Punto posIota = posicionar(Iota.getAlto(), Iota.getAncho());
						if(posIota != null)
						{
							Iota e = new Iota(posIota.getX(), posIota.getY());
							coleccion.add(e);
						}
						break;
				case '1': 
					Punto posIrromp = posicionar(Irrompible.getAlto(), Irrompible.getAncho());
					if(posIrromp != null)
					{
						Irrompible i = new Irrompible(posIrromp.getX(), posIrromp.getY());
						coleccion.add(i);
					}
					break;
				case '2': 
					Punto posPared = posicionar(Pared.getAlto(), Pared.getAncho());
					if(posPared != null)
					{
						Pared p = new Pared(posPared.getX(), posPared.getY());
						coleccion.add(p);
					}
					break;
				case '3': 
					Punto posParedJ = posicionar(ParedJugador.getAlto(), ParedJugador.getAncho());
					if(posParedJ != null)
					{
						ParedJugador j = new ParedJugador(posParedJ.getX(), posParedJ.getY());
						coleccion.add(j);
					}
					break;		
				case '4': 
					Punto posReb = posicionar(Rebote.getAlto(), Rebote.getAncho());
					if(posReb != null)
					{
						Rebote r = new Rebote(posReb.getX(), posReb.getY());
						coleccion.add(r);
					}
					break;	
				case '5': 
					Punto posPortal = posicionar(Portal.getAlto(), Portal.getAncho());
					if(posPortal != null)
					{
						Portal o = new Portal(posPortal.getX(), posPortal.getY());//OJO resolver como posicionar el segundo portal
						coleccion.add(o);
					}
					break;	
				}
				x++;
				try {
					c =(char) arch.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			x=0;
			y++;
			}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
	}
	}
	
	//CAMBIO: le paso ancho y alto y devuelve x e y de pos. Maneja la coleccion ocupados
	private Punto posicionar(int alto, int ancho)
	{
		//int ancho = e.getPosicion.getAncho(); //-> viene por paramtro, la altura tambien
		if (y+alto<PosicionMaxima.getY() && x+ancho<PosicionMaxima.getX() && !ocupados(x, ancho))
		{
			try {
			char aux ='.';
			for(int i=0; i<ancho||aux=='/'; i++)
			{			
				for(int j=y; j<alto; j++)
					ocupados.add(new Point(x,y));
					aux = (char) arch.read();
			
				x++;
			}
			int posx = x-ancho/2;
			int posy = y-alto/2;
			return new Punto (posx, posy); 
			} catch (IOException e) {
				return null;
			}	
		}
		return null;
	}
	
	private boolean ocupados(int pos, int ancho)
	{
		boolean estaOcupado = false;
		for(int i = pos; i<pos+ancho; i++)
		{
			if (ocupados.contains(new Point(x,y)))
				{
					estaOcupado= true;
				}
		}
		return estaOcupado;
	}


	
	public Collection<Elemento> getColeccion()
	{
		return coleccion;
	}
}
