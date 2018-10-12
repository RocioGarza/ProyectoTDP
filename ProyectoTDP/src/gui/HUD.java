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
		
		vida.setOpaque(true);

		puntajeGrafico.setBounds(Posicion.getXmax()-400, 20, 40, 40);
		puntaje.setBounds(Posicion.getXmax()-350, 20, 40, 40);
		vida.setBounds(Posicion.getXmax()-275, 25 , 200, 25);
		vida.setBackground(Color.GREEN);
		
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(new Font("",Font.PLAIN, 20 ));
		
		vidaHud = new JLabel(new ImageIcon(this.getClass().getResource("/Graficos/vidaHud.png")));
		vidaHud.setBounds(Posicion.getXmax()-300, 4 , 261, 80);
		
		componentes.add(vidaHud);
		componentes.add(puntaje);
		componentes.add(puntajeGrafico);
		componentes.add(vida);

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
						
			vida.setBounds(Posicion.getXmax()-275, 25, ((mapa.getJugador().getVida()*200)/mapa.getJugador().getVidaMaxima()), 25);
			puntaje.setText("" + mapa.getPuntaje());
		}
	}
}
