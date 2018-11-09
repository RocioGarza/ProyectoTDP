package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu {
	
	private GUI gui;
	private JPanel panel;
	private JButton botonJugar;
	private JButton botonSalir;
	
	public Menu(GUI g) {
		gui=g;
		crearPanel();
		crearBotones();
		agregarBotonesAPanel();
		establecerActionListeners();
	}
	
	public JPanel getMenu() {
		return panel;
	}
	
	private void crearPanel() {
		panel = new JPanel();
		panel.setLayout(null);
	}
	
	private void crearBotones() {
		crearBotonJugador();
		crearBotonSalir();
	}
	
	private void crearBotonJugador() {
		botonJugar = new JButton(new ImageIcon(this.getClass().getResource("/Graficos/botonJugar.png")));
		establecerFondoBotonInvisible(botonJugar);
		botonJugar.setBounds(662, 500, 116, 50);
	}
	
	private void crearBotonSalir() {
		botonSalir = new JButton(new ImageIcon(this.getClass().getResource("/Graficos/botonSalir.png")));
		establecerFondoBotonInvisible(botonSalir);
		botonSalir.setBounds(615, 600, 210, 60);
	}
	
	private void agregarBotonesAPanel() {
		panel.add(botonJugar);
		panel.add(botonSalir);
	}
	
	private void establecerFondoBotonInvisible(JButton b) {
		b.setOpaque(false);
		b.setContentAreaFilled(false);
		b.setBorderPainted(false);
	}
	
	private void establecerActionListeners() {
		botonJugar.addActionListener(new OyenteJugar());
		botonSalir.addActionListener(new OyenteSalir());
	}
	
	private class OyenteJugar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuJugar menuJ = new MenuJugar(gui);
			gui.getContentPane().removeAll();
			gui.getContentPane().add(menuJ.getMenu());
			gui.setVisible(true);
		}
	}
	
	private class OyenteSalir implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			gui.guardarJuego();
			System.exit(0);
		}
	}
}
