package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import entidad.Posicion;
import logica.AdministradorDeMovimiento;
import logica.Juego;
import logica.Mapa;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private Juego juego;
	private Mapa mapa;
	private HUD hud;
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setBounds(0, 0, Posicion.getXmax(), Posicion.getYmax());
		frame.setVisible(true);
		frame.crearSigNivel();	
	}

	public GUI() {
		juego = new Juego(); //Aca o se recupera o se genera un nuevo juego
	}
	
	private void crearSigNivel() {
		crearMapa();
		crearHUD();
		AdministradorDeMovimiento admMov = new AdministradorDeMovimiento(mapa);
		addKeyListener(admMov.getOyente());
		iniciarJuego(admMov);
		getContentPane().removeAll();
		crearSigNivel();
	}
	
	private void crearMapa() {
		mapa = juego.crearMapa();
		getContentPane().add(mapa.getMapaGrafico().getGrafica());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, Posicion.getXmax(), Posicion.getYmax());
	}

	private void crearHUD()	{
		hud = new HUD(mapa);
		for(JLabel componente : hud.getComponentes())
			mapa.getMapaGrafico().getGrafica().add(componente);
	}
	
	private void iniciarJuego(AdministradorDeMovimiento admMov) {
		hud.start();
		juego.jugar(admMov);
	}
}