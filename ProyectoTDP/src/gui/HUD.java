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
		crearEtiquetaPuntaje();
		crearEtiquetaVida();
		crearEtiquetaArma();
		agregarComponentes();		
	}
	
	private void crearEtiquetaPuntaje() {
		puntajeIcono = new ImageIcon(this.getClass().getResource("/Graficos/moneda.png"));
		puntajeGrafico = new JLabel(puntajeIcono);
		puntajeGrafico.setBounds(Posicion.getXmax()-450, 20, 40, 40);
		puntaje = new JLabel();
		puntaje.setBounds(Posicion.getXmax()-400, 20, 40, 40);
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(new Font("",Font.PLAIN, 20 ));		
	}
	
	private void crearEtiquetaVida() {
		vidaHud = new JLabel(new ImageIcon(this.getClass().getResource("/Graficos/VidaHud.png")));
		vidaHud.setBounds(Posicion.getXmax()-350, 4 , 261, 80);
		vida = new JLabel(vidaIcono);
		vida.setOpaque(true);
		vida.setBounds(Posicion.getXmax()-350, 25 , 200, 25);
		vida.setBackground(Color.GREEN);		
	}
	
	private void crearEtiquetaArma() {
		arma = new JLabel();
		arma.setBounds(Posicion.getXmax()-75, 20 , 20, 44);
	}
	
	private void agregarComponentes() {
		componentes = new LinkedList<JLabel>();
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
			setearColorBarraDeVida();	
			vida.setBounds(Posicion.getXmax()-325, 25, ((mapa.getJugador().getVida()*200)/mapa.getJugador().getVidaMaxima()), 25);
			puntaje.setText("" + mapa.getPuntaje());
			arma.setIcon(mapa.getJugador().getArma().getIcono());
		}
	}
	
	private void setearColorBarraDeVida() {
		int porcVida = mapa.getJugador().getVida()*100/mapa.getJugador().getVidaMaxima();
		if(porcVida<=25)
			vida.setBackground(Color.RED);
		else if(porcVida<=50)
				vida.setBackground(Color.ORANGE);
				else if(porcVida<=75)
						vida.setBackground(Color.YELLOW);
					else
							vida.setBackground(Color.GREEN);
	}
}