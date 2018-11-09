package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu {
	
	private JPanel panel;
	private JButton botonJugar;
	private JButton botonSalir;
	
	public Menu() {
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
			//Hacer algo cuando se presiona BotonJugar
			System.out.println("Aprete jugar");
		}
	}
	
	private class OyenteSalir implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Hacer algo cuando se presiona BotonSalir
			System.out.println("Aprete salir");
		}
	}
}
