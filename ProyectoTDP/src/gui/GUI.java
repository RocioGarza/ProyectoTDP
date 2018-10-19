package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import entidad.Posicion;
import logica.Juego;
import logica.Mapa;
import logica.Reloj;
import proyectil.Proyectil;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private Juego juego;
	private Mapa mapa;
	private HUD hud;
	private Reloj reloj;
	private Map<String,Character> mapeoInputs;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		addKeyListener(new Oyente());
		
		mapeoInputs = new HashMap<String,Character>();
		mapeoInputs.put("Movimiento",'x');
		mapeoInputs.put("Disparo",'x');
		
		juego = new Juego();
		mapa = juego.crearMapa();
		getContentPane().add(mapa.getGrafico());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, Posicion.getXmax(), Posicion.getYmax());
		hud = new HUD(mapa);
		
		for(JLabel componente : hud.getComponentes())
			mapa.getGrafico().add(componente);
		
		reloj = new Reloj(mapa, mapeoInputs);
		reloj.start();
		hud.start();
	}
	
	public class Oyente implements KeyListener {

		public void keyPressed(KeyEvent key) {
			if(key.getKeyChar() == 'a') 
				mapeoInputs.put("Movimiento", 'a');
			else
				if(key.getKeyChar() == 'd')
					mapeoInputs.put("Movimiento", 'd');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", ' ');
		}

		public void keyReleased(KeyEvent key) {
			if(key.getKeyChar() == 'a') 
				mapeoInputs.put("Movimiento", 'x');
			else
				if(key.getKeyChar() == 'd')
					mapeoInputs.put("Movimiento", 'x');
			if(key.getKeyChar() == ' ')
				mapeoInputs.put("Disparo", 'x');
		}

		public void keyTyped(KeyEvent key) { }		
	}
}