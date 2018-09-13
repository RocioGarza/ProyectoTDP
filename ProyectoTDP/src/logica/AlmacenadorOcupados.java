package logica;

import java.util.HashMap;
import java.util.LinkedList;

public class AlmacenadorOcupados {
	private HashMap<Integer, LinkedList<Integer>> ocupados;

	public AlmacenadorOcupados()
	{
		ocupados = new HashMap<Integer, LinkedList<Integer>>();
	}
	
	public void add(int x, int y)
	{
		if(ocupados.containsKey(x))
			ocupados.get(x).add(y);
		else
		{
			LinkedList<Integer> l =new LinkedList<Integer>();
			l.add(y);
			ocupados.put(x, l);
		}
	}
	
	public boolean estaOcupado(int x, int y)
	{
		if(ocupados.containsKey(x)) {
		LinkedList<Integer> listaY = ocupados.get(x);
		for(Integer posY: listaY)
			if(posY.equals(y))
				return true;
		}
		return false;
	}
}
