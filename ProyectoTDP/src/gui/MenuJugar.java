package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuJugar {
	
	private GUI gui;
	private JPanel panel;
	private JButton botonContinuar;
	private JButton botonSeleccionDeNivel;
	private JButton botonCrearMapaRandom;
	private JButton botonUltimoMapaRandom;
	
	public MenuJugar(GUI g) {
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
		crearBotonContinuar();
		crearBotonSeleccionDeNivel();
		crearBotonCrearMapaRandom();
		crearBotonUltimoMapaRandom();
	}
	
	private void crearBotonContinuar() {
		botonContinuar = new JButton(new ImageIcon(this.getClass().getResource("/Graficos/botonContinuar.png")));
		establecerFondoBotonInvisible(botonContinuar);
		botonContinuar.setBounds(373, 300, 173, 51);
	}
	
	private void crearBotonSeleccionDeNivel() {
		botonSeleccionDeNivel = new JButton(new ImageIcon(this.getClass().getResource("/Graficos/botonSeleccionDeNivel.png")));
		establecerFondoBotonInvisible(botonSeleccionDeNivel);
		botonSeleccionDeNivel.setBounds(323, 400, 274, 51);
	}
	
	private void crearBotonCrearMapaRandom() {
		botonCrearMapaRandom = new JButton(new ImageIcon(this.getClass().getResource("/Graficos/botonCrearMapaRandom.png")));
		establecerFondoBotonInvisible(botonCrearMapaRandom);
		botonCrearMapaRandom.setBounds(828, 300, 303, 51);
	}
	
	private void crearBotonUltimoMapaRandom() {
		botonUltimoMapaRandom = new JButton(new ImageIcon(this.getClass().getResource("/Graficos/BotonJugarUltimoRandom.png")));
		establecerFondoBotonInvisible(botonUltimoMapaRandom);
		botonUltimoMapaRandom.setBounds(785, 400, 390, 51);
	}
	
	private void agregarBotonesAPanel() {
		panel.add(botonContinuar);
		panel.add(botonSeleccionDeNivel);
		panel.add(botonCrearMapaRandom);
		panel.add(botonUltimoMapaRandom);
	}
	
	private void establecerFondoBotonInvisible(JButton b) {
		b.setOpaque(false);
		b.setContentAreaFilled(false);
		b.setBorderPainted(false);
	}
	
	private void establecerActionListeners() {
		botonContinuar.addActionListener(new OyenteContinuar());
		botonSeleccionDeNivel.addActionListener(new OyenteSeleccionDeNivel());
		botonCrearMapaRandom.addActionListener(new OyenteCrearMapaRandom());
		botonUltimoMapaRandom.addActionListener(new OyenteUltimoMapaRandom());
	}
	
	private class OyenteContinuar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			gui.crearSigNivel();
		}
	}
	
	private class OyenteSeleccionDeNivel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Abrir seleccionardor de nivel
		}
	}
	
	private class OyenteCrearMapaRandom implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			gui.crearNuevoNivelRandom();
		}
	}
	
	private class OyenteUltimoMapaRandom implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			gui.usarUltimoNivelRandom();
		}
	}
}