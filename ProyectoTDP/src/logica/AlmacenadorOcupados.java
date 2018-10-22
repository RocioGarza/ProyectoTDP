package logica;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AlmacenadorOcupados {
	
	private Map<Integer, Collection<Integer>> ocupados;

	public AlmacenadorOcupados()	{
		ocupados = new HashMap<Integer, Collection<Integer>>();
	}
	
	public void add(int x, int y)	{
		if(ocupados.containsKey(x))
			ocupados.get(x).add(y);
		else	{
			Collection<Integer> l =new LinkedList<Integer>();
			l.add(y);
			ocupados.put(x, l);
		}
	}
	
	public boolean estaOcupado(int x, int y)
	{
		if(ocupados.containsKey(x)) {
			Collection<Integer> listaY = ocupados.get(x);
			for(Integer posY: listaY)
				if(posY.equals(y))
					return true;
		}
		return false;
	}
}
