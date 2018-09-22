package logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import obstaculo.*;
import enemigo.*;
import entidad.Entidad;
import entidad.Posicion;
import jugador.Jugador;

public class GeneradorMapa {
	
	BufferedReader arch;
	private Collection<Entidad> coleccion;
	private int x;
	private int y;
	private int yMax;
	private char c;
	private AlmacenadorOcupados ocupados;
	
	public GeneradorMapa(String txt)
	{	 
		yMax = Posicion.getYmax()-(Jugador.getAlto()*2);
		coleccion = new LinkedList<Entidad>();
		ocupados = new AlmacenadorOcupados();
		try {
			arch =  new BufferedReader(new FileReader(txt));
			x=0;
			y=0;
			while(y<(yMax)) {
				c =(char) arch.read();
				while(c!='/' && x!= Posicion.getXmax()) 
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
					c =(char) arch.read();
				}
				x=0;
				y++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Punto posicionar(int alto, int ancho)
	{
		Punto pos = null;
		if (y+alto<yMax && x+ancho<Posicion.getXmax() && !ocupados(x, ancho))
		{
			try {
				char aux ='.';
				int xAux =x;
				for(int i=xAux; i<xAux+ancho||aux=='/'; i++)
				{			
					for(int j=y; j<y+alto; j++)
						ocupados.add(i,j);
					aux = (char) arch.read();
					x++;
				}
				pos = new Punto (x-ancho/2, y+alto/2); 
			} catch (IOException e) {
				return null;
			}	
		}
		return pos;
	}
	
	private boolean ocupados(int pos, int ancho)
	{
		boolean estaOcupado = false;
		for(int i = pos; i<pos+ancho && !estaOcupado; i++)
		{
			if (ocupados.estaOcupado(i,y))
				estaOcupado = true;
		}
		return estaOcupado;
	}
	
	public Collection<Entidad> getColeccion()
	{
		return coleccion;
	}
}
