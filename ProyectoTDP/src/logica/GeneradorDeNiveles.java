package logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import entidad.Posicion;


public class GeneradorDeNiveles{
	
	private File txt;
	
	public GeneradorDeNiveles()
	{
		String dir = this.getClass()+"nivel0.txt"; //El nivel 0 va estar asociado al nivel random, los demas niveles corresponden con su dificultadx
        txt = new File(dir);
        this.generarNivel();
	}
	
	public File getNivel()
	{
		return txt;
	}
	
	private void generarNivel()
	{
		Random rnd = new Random(); //Le damos la hora del sistema como semilla??
		int n = 0;
		try {
			BufferedWriter arch = new BufferedWriter(new FileWriter("nivel0.txt"));
			for(int j=0; j<Posicion.getYmax(); j++)
			{	
			for(int i=0; i<Posicion.getXmax(); i++)
			{
				n = rnd.nextInt(400000); //CAMBIAR % ANTES ERA 400
				switch(n) 
				{
					case 0: case 1: case 2: case 3: case 4: case 5:
						arch.write("A"); // 1,5%
						break;
					case 6: case 7: case 8: case 9:
						arch.write("B"); // 1%
						break;
					case 10: case 11: case 12: case 13: 
						arch.write("C"); // 1%
						break;
					case 14: case 15: case 16: case 17: case 18: case 19:
						arch.write("D"); // 1,5%
						break;
					case 20: case 21: case 22: case 23:
						arch.write("E"); // 1%
						break;
					case 24: 
						arch.write("1"); // 0,25%
						break;
					case 25: case 26: case 27: case 28:
						arch.write("2"); // 1%
						break;					
					case 29: case 30: case 31:
						arch.write("3"); // 0,75%
						break;
					case 32: case 33:
						arch.write("4"); // 0,5%
						break;
					case 34:
						arch.write("5"); // 0,25%
						break;
					default: 
						arch.write("."); // 100-8,75=91,25%
						break;	
				}
				
			}
			arch.write("/");
			arch.write('\n');
		}			
			arch.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace(); //Como manejamos esta excepcion?
		}
		
		
		
		
	}
	
}
