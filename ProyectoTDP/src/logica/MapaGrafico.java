package logica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elemento.Elemento;

public class MapaGrafico {

	private JPanel panel;
	
	public MapaGrafico(Collection<Elemento> coleccion) {
		panel = new JPanel();
		posicionarElementos(coleccion);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
	}
	
	private void posicionarElementos(Collection<Elemento> coleccion)
	{
		for(Elemento e: coleccion)
		{
			JLabel label = e.getGrafico();
			panel.add(label);
		}
		
	}
	
	public JPanel getGrafica()
	{
		return panel;
	}

}