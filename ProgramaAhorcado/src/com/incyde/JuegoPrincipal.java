package com.incyde;
//TODO: Preguntar si letra o palabra

public class JuegoPrincipal {
	static String palabraElegida = "";
	static String letra = "";
	static String guiones = "";
	static String nuevosGuiones = "";
	static String nuevosGuionesAnterior = "";
	static int longitudPalabra;
	static int contadorFallos = 0;

	static String soloGuiones_A() {
		String guiones = "";
		for (int i = 0; i < longitudPalabra; i++) {
			guiones = guiones + "-";
		}
		return guiones;
	}
	static String soloGuiones_B() {
		String guiones = "-----------".substring(0, longitudPalabra);
		return guiones;
	}
	public static void main(String[] args) {
		palabraElegida = ListaPalabras.palabraAleatoria();
		longitudPalabra = palabraElegida.length();	
		// System.out.println("La palabra es " + ListaPalabras.palabraAleatoria());
		guiones = soloGuiones_A(); 		
		nuevosGuionesAnterior =  guiones;
		 System.out.println("Palabra: " + guiones);
		 nuevosGuiones = guiones;
		while(nuevosGuiones.contains("-") && contadorFallos <= 6 ) {
			letra = VistaYTeclado.pedirLetra();
			System.out.println("La letra es " + letra);
			// guiones = "----------------------".substring(0, longitudPalabra); 
			if (palabraElegida.contains(letra)) {
				cuandoAciertaLetra();
			} else {
				contadorFallos = contadorFallos + 1;  // contadorFallos++;
				System.out.println("Has fallado " + contadorFallos + " veces" );				
			}
		}	
		if (contadorFallos >= 6) {
			System.out.println("Se siente pero has perdido");	
		}
		else {
			System.out.println("Felicidades! Has ganado!");	
		}
	}
	static void cuandoAciertaLetra() {
		int posicion;
		String letraPos;
		nuevosGuiones = "";
		for (posicion = 0; posicion < longitudPalabra; posicion++) {
			letraPos = String.valueOf(palabraElegida.charAt(posicion));
			
			if (letra.equals(letraPos)) { // A
				// System.out.println("pos: " + posicion + ", let: " +letraPos);
				nuevosGuiones = nuevosGuiones + letraPos;
			} else { // X
				
				nuevosGuiones = nuevosGuiones + nuevosGuionesAnterior.charAt(posicion);
				
			}
			
		}
		nuevosGuionesAnterior = nuevosGuiones;
		System.out.println(nuevosGuiones);
	}
	void pruebasString() {
		/*System.out.println(palabraElegida.charAt(2));
		System.out.println("Indice: " + palabraElegida.indexOf(letra));*/
	}
}
