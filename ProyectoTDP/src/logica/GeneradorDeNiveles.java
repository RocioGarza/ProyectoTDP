package logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import entidad.Posicion;

public class GeneradorDeNiveles {
	
	private File nuevoNivel;
	private BufferedWriter arch;
	private Random rnd;
	
	public GeneradorDeNiveles()	{
		String dir = this.getClass()+"nivel0.txt"; //El nivel 0 va estar asociado al nivel random, los demas niveles corresponden con su dificultadx
        nuevoNivel = new File(dir);
        generarArchivo();
	}
	
	private void generarArchivo() {
		rnd = new Random();
		abrirArchivo();
        generarNivel();
        cerrarArchivo();
	}
	
	private void abrirArchivo()	{
		try {
			arch = new BufferedWriter(new FileWriter("nivel0.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void generarNivel()	{
		try { 
			for(int j=0; j<Posicion.getYmax(); j++) 	
				escribirLinea();						
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	private void escribirLinea() throws IOException	{
		for(int i=0; i<Posicion.getXmax(); i++)	{
			int n = siguienteRandom();
			escribirCaracter(n);	
		}
		saltarLinea();
	}
	
	private void saltarLinea() throws IOException	{
		arch.write("/");
		arch.write('\n');
	}
	
	private int siguienteRandom()	{
		return rnd.nextInt(400000); 
	}
	
	private void escribirCaracter(int n) throws IOException	{
		switch(n) {
			case 0: case 1: case 2: case 3: case 4: case 5:
				arch.write("A"); 
				break;
			case 6: case 7: case 8: case 9:
				arch.write("B"); 
				break;
			case 10: case 11: case 12: case 13: 
				arch.write("C"); 
				break;
			case 14: case 15: case 16: case 17: case 18: case 19:
				arch.write("D"); 
				break;
			case 20: case 21: case 22: case 23:
				arch.write("E"); 
				break;
			case 24:  
				arch.write("1"); 
				break;			
			case 25: case 26: case 27: case 28:
				arch.write("2"); 
				break;				
			case 29: case 30: case 31:
				arch.write("3"); 
				break;/*
			case 32: case 33:
				arch.write("4"); 
				break;
			case 34:
				arch.write("5"); 
				break;*/
			default: 
				arch.write("."); 
				break;	
		}
	}
	
	private void cerrarArchivo() {  
		try {
			arch.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File getNivel()	{
		return nuevoNivel;
	}	
}
