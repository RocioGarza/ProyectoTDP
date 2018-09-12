package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import logica.Mapa;
import logica.MapaGrafico;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private Mapa mapa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				mover(arg0);
			}
		});
		mapa = new Mapa();
		setContentPane(mapa.getGrafico().getGrafica());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 1280, 1024);
		
	}
	
	protected void mover(KeyEvent key){
		char aux=key.getKeyChar();
		//System.out.println(aux);
		mapa.getJugador().mover(aux);	
		//System.out.println(mapa.getJugador().getPosicion().getX());
		//System.out.println(mapa.getJugador().getPosicion().getY());
		//System.out.println(mapa.getJugador().getGrafico().getPos().getX());
		//System.out.println(mapa.getJugador().getGrafico().getPos().getY());
	}
	
	
}
