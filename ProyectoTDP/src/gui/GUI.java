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
		//frame.crearSigNivel();	
	}

	public GUI() {
		juego = new Juego(); //Aca o se recupera o se genera un nuevo juego
		crearMenu();
	}
	
	private void crearMenu() {
		Menu menu = new Menu(this);
		getContentPane().removeAll();
		getContentPane().add(menu.getMenu());
		setVisible(true);
	}
	
	private void crearMenuJugar() {
		MenuJugar menu = new MenuJugar(this);
		getContentPane().removeAll();
		getContentPane().add(menu.getMenu());
		setVisible(true);
	}
	
	public void crearSigNivel() {
		crearMapa();
		iniciarNivel();	
		crearSigNivel();
	}
	
	private void crearMapa() {
		mapa = juego.crearMapa();
		configurarMapa();
	}
	
	public void crearNivelSeleccionado(int n) {
		crearMapaSeleccionado(n);
		iniciarNivel();		
		crearMenuJugar();
	}
	
	private void crearMapaSeleccionado(int n) {
		mapa = juego.crearMapa(n);
		configurarMapa();	
	}
	
	public void crearNuevoNivelRandom() {
		crearMapaRandom();
		iniciarNivel();
		crearMenuJugar();
	}
	
	private void crearMapaRandom() {
		mapa = juego.crearMapa(-1);
		configurarMapa();
	}
	
	public void usarUltimoNivelRandom() {
		crearUltMapaRandom();
		iniciarNivel();
		crearMenuJugar();
	}
	
	private void crearUltMapaRandom() {
		mapa = juego.crearMapa(0);
		configurarMapa();
	}
	
	private void configurarMapa() {
		getContentPane().add(mapa.getMapaGrafico().getGrafica());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, Posicion.getXmax(), Posicion.getYmax());		
	}
	
	private void iniciarNivel() {
		crearHUD();
		AdministradorDeMovimiento admMov = new AdministradorDeMovimiento(mapa);
		addKeyListener(admMov.getOyente());
		iniciarJuego(admMov);
		getContentPane().removeAll();
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
	
	public void guardarJuego() {
		juego.guardarJuego();
	}
}