package Inteligencia;

import enemigo.AnomaliaTemporal;
import logica.Entorno;

public class IA_AnomaliaTemporal extends InteligenciaEnemigo{

	private AnomaliaTemporal anomalia;
	private long tiempoInicio;
	
	public IA_AnomaliaTemporal(AnomaliaTemporal a) {
		anomalia=a;
		tiempoInicio=System.currentTimeMillis();
	}
	
	public void mover() {
		if(System.currentTimeMillis()-tiempoInicio>45000) {
			anomalia.quitarVida(anomalia.getVidaMaxima());
			Entorno.getEntorno().afectar(anomalia);
		}
		else
			actualizarImagen();
	}

	private void actualizarImagen() {
		if(System.currentTimeMillis()-tiempoInicio>36000)
			anomalia.getGrafico().changeIcon(' ');
		else
			if(System.currentTimeMillis()-tiempoInicio>27000)
				anomalia.getGrafico().changeIcon('a');
			else
				if(System.currentTimeMillis()-tiempoInicio>18000)
					anomalia.getGrafico().changeIcon('d');
				else
					if(System.currentTimeMillis()-tiempoInicio>9000)
						anomalia.getGrafico().changeIcon('s');
	}
}
