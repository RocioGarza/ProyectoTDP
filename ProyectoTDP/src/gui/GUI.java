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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
		//	public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.iniciarGUI();
					
				} catch (Exception e) {}
		//	}
		//});
	}

	/**
	 * Create the frame.
	 */
	public GUI()
	{
	}
	
	public void iniciarGUI() {		
		
		juego = new Juego(); //Aca o se recupera o se genera un nuevo juego
		
		//opciones:crear un mapa de un nivel menor al actual, crear un mapa random (n=-1), usar el ultimo mapa random(n=0), usar el utlimo nivel (sin param)
		
		mapa = juego.crearMapa(3);		
		
		getContentPane().add(mapa.getGrafico());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, Posicion.getXmax(), Posicion.getYmax());
		
		hud = new HUD(mapa);
		
		for(JLabel componente : hud.getComponentes())
			mapa.getGrafico().add(componente);
	
		AdministradorDeMovimiento r = new AdministradorDeMovimiento(mapa);
		addKeyListener(r.getOyente());

		hud.start();
		juego.jugar(r);
		System.out.println("GENERANDO MENU");
		
	}

}