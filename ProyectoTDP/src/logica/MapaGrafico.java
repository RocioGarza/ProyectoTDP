package logica;

import java.awt.Color;
import java.util.Collection;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidad.Entidad;
import entidad.EntidadGrafica;


public class MapaGrafico {

	private JPanel panel;
	
	public MapaGrafico(Collection<Entidad> coleccion) {
		panel = new JPanel();
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
