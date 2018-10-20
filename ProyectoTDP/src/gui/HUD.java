package gui;

import java.awt.Color;
import java.awt.Font;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import entidad.Posicion;
import logica.Mapa;

public class HUD extends Thread{

	private Icon puntajeIcono;
	private Icon vidaIcono;
	private JLabel puntaje;
	private JLabel puntajeGrafico;
	private JLabel vida;
	private JLabel vidaHud;
	private JLabel arma;
	private Mapa mapa;
	private Collection<JLabel> componentes;
	
	public HUD(Mapa mapa) {
		this.mapa=mapa;
		
		componentes = new LinkedList<JLabel>();
		
		puntajeIcono = new ImageIcon(this.getClass().getResource("/Graficos/moneda.png"));
		//vidaIcono = new ImageIcon(this.getClass().getResource("/Graficos/vida.png"));
		
		puntajeGrafico = new JLabel(puntajeIcono);
		puntaje = new JLabel();
		vida = new JLabel(vidaIcono);
		arma = new JLabel();
		
		vida.setOpaque(true);

		puntajeGrafico.setBounds(Posicion.getXmax()-450, 20, 40, 40);
		puntaje.setBounds(Posicion.getXmax()-400, 20, 40, 40);
		vida.setBounds(Posicion.getXmax()-350, 25 , 200, 25);
		vida.setBackground(Color.GREEN);
		arma.setBounds(Posicion.getXmax()-75, 20 , 20, 44);
		
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(new Font("",Font.PLAIN, 20 ));
		
		vidaHud = new JLabel(new ImageIcon(this.getClass().getResource("/Graficos/vidaHud.png")));
		vidaHud.setBounds(Posicion.getXmax()-350, 4 , 261, 80);
		
		componentes.add(vidaHud);
		componentes.add(puntaje);
		componentes.add(puntajeGrafico);
		componentes.add(vida);
		componentes.add(arma);
	}
	
	public Collection<JLabel> getComponentes() {
		return componentes;
	}
	
	public void run() {
		while(true) {
			if(mapa.getJugador().getVida()*100/mapa.getJugador().getVidaMaxima()<=25)
				vida.setBackground(Color.RED);
			else
				if(mapa.getJugador().getVida()*100/mapa.getJugador().getVidaMaxima()<=50)
					vida.setBackground(Color.ORANGE);
					else
						if(mapa.getJugador().getVida()*100/mapa.getJugador().getVidaMaxima()<=75)
							vida.setBackground(Color.YELLOW);
						
			vida.setBounds(Posicion.getXmax()-325, 25, ((mapa.getJugador().getVida()*200)/mapa.getJugador().getVidaMaxima()), 25);
			puntaje.setText("" + mapa.getPuntaje());
			
			arma.setIcon(mapa.getJugador().getArma().getIcono());
		}
	}
}
