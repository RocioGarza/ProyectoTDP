package colisionador;

import java.util.Random;

import jugador.Jugador;
import escudo.*;

public class ColisionadorEscudoKamikaze extends ColisionadorPremio{

	public void serChocado(Jugador e) {
		e.setEscudo(new EscudoAntiKamikaze());
		Random r = new Random();
		int a = r.nextInt(4);
		if(a==0)
			System.out.println("Y ahora quien podra salvarnos? Definitivamente no el Escudo Anti Kamikazes");
		else
			if(a==1)
				System.out.println("Este seria un buen momento para obtener un escudo ... pero mejor no!");
			else
				if(a==2)
					System.out.println("Un Escudo por aqui, Un Escudo por alla, un Escudo te saludara");
				else
					if(a==3) {
						System.out.println("Nena!");
						System.out.println("QUE?");
						System.out.println("Donde esta mi Escudo?");
						System.out.println("Ahh lo puse por ahi");
						System.out.println("DONDE?!");
						System.out.println("Para que quieres saber?");
						System.out.println("LO NECESITO!!!");
						System.out.println("AH AH, NI SE TE OCURRA HACERTE EL HEROE!");
					}
					else
						if(a==4)
							System.out.println("Marge, el Escudo!");
	}
}
