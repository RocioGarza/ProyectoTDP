package logica;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidad.Entidad;
import entidad.EntidadGrafica;
import gui.PanelConFondo;


public class MapaGrafico {

	private PanelConFondo panel;
	
	public MapaGrafico(Collection<Entidad> coleccion) {
		BufferedImage img = null;
		
		try {
		    img = ImageIO.read(new File("src/Graficos/Fondo.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		panel = new PanelConFondo(img);
		posicionarElementos(coleccion);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
	}
	
	private void posicionarElementos(Collection<Entidad> coleccion)
	{
		for(Entidad e: coleccion)
		{
			panel.add(e.getGrafico().getGrafico());
		}
		
	}
	
	public JPanel getGrafica()
	{
		return panel;
	}
	
	public void agregarGrafico(EntidadGrafica e) {
		panel.add(e.getGrafico());
	}

	public void removerGrafico(EntidadGrafica e) {
		panel.remove(e.getGrafico());
		panel.repaint();
	}
}
