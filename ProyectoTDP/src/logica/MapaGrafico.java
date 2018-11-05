package logica;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EntidadGrafica.EntidadGrafica;
import entidad.Entidad;
import gui.PanelConFondo;


public class MapaGrafico {

	private PanelConFondo panel;
	
	public MapaGrafico(Collection<Entidad> coleccion) {
		crearPanel();	
		posicionarElementos(coleccion);
		establecerPropiedadesDelPanel();
	}
	
	private void crearPanel() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("src/Graficos/Fondo.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel = new PanelConFondo(img);
	}
	
	private void posicionarElementos(Collection<Entidad> coleccion)	{
		for(Entidad e: coleccion)
			panel.add(e.getGrafico().getGrafico());
	}
	
	private void establecerPropiedadesDelPanel() {
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
	}
	
	public JPanel getGrafica()	{
		return panel;
	}
	
	public void agregarGrafico(EntidadGrafica e) {
		panel.add(e.getGrafico());
	}

	public void removerGrafico(EntidadGrafica e) {
		panel.remove(e.getGrafico());
	}
	
	public void actualizar() {
		panel.repaint();
	}
}
