package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import logica.ControlDeColisiones;
import logica.Mapa;
import logica.Reloj;
import proyectil.Proyectil;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private Mapa mapa;
	private Reloj reloj;
	private Refresh refresh;
	private ControlDeColisiones controlador;
	
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
		mapa = new Mapa(0);
		getContentPane().add(mapa.getGrafico());
		//setContentPane(mapa.getGrafico());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 1280, 1024);
		reloj = new Reloj(mapa);
		reloj.start();
		refresh = new Refresh(mapa);
		refresh.start();
		controlador = new ControlDeColisiones(mapa);
		controlador.start();
	}
	
	protected void mover(KeyEvent key){
		char aux=key.getKeyChar();
		if(aux=='x') {
			Proyectil p = mapa.getJugador().atacarJugador();
			mapa.getColeccion().add(p);
			mapa.getMapaGrafico().agregarGrafico(p.getGrafico());
		}
		else
			mapa.getJugador().mover(aux);
	}
	
}
