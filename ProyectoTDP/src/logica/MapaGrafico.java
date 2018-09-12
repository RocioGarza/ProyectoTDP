package logica;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;

import elemento.Elemento;

public class MapaGrafico {

	JPanel panel;
	
	public MapaGrafico(Collection<Elemento> coleccion) {
		panel = new JPanel();
		posicionarElementos(coleccion);
	}
	
	private void posicionarElementos(Collection<Elemento> coleccion)
	{
		panel.setLayout(new FlowLayout()); //tengo problemas
		for(Elemento e: coleccion)
		{
			JLabel label = e.getGrafico();
			panel.add(label);
		}
		
	}
	
	private JPanel getGrafica()
	{
		return panel;
	}

}
