package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuNiveles {

	private PanelConFondo panel;
	private JButton[] botones;
	
	public MenuNiveles() {
		crearPanel();
		
		crearBotones();

		establecerFondoBotonesInvisible();
		
		agregarBotonesAPanel();
		
		establecerActionListeners();
	}
	
	public JPanel getMenu() {
		return panel;
	}
	
	private void crearPanel() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("src/Graficos/Fondo.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel = new PanelConFondo(img);
		panel.setLayout(null);
	}
	
	private void crearBotones() {
		String imagen;
		botones = new JButton[50];
		int nivel=0;
		for(int c=0 ; c<5 ; c++) {
			for (int f=1 ; f<=10 ; f++) {
				nivel = f+c*10;
				imagen = "/Graficos/BotonNivel" + nivel + ".png";
				botones[nivel-1] = new JButton(new ImageIcon(this.getClass().getResource(imagen)));
				
				botones[nivel-1].setBounds(200+75*(f-1)+29*(f-1), 150+75*c+15*c, 75, 75);
			}
		}
	}
	
	
	private void agregarBotonesAPanel() {
		for(JButton boton : botones){
			panel.add(boton);
		}
	}
	
	private void establecerFondoBotonesInvisible() {
		for(JButton boton : botones){
			boton.setOpaque(false);
			boton.setContentAreaFilled(false);
			boton.setBorderPainted(false);
		}
	}
	
	private void establecerActionListeners() {
		for(int i=0 ; i<50 ; i++) {
			botones[i].addActionListener(new OyenteJugarNivel(i+1));
		}
	}
	
	private class OyenteJugarNivel implements ActionListener {
		private int nivel;
		
		public OyenteJugarNivel(int n) {
			nivel=n;
		}
		
		public void actionPerformed(ActionEvent e) {
			//Hace algo
			System.out.println("Queres jugar el nivel " + nivel);
		}
	}
}
