package com.incyde;

public class JuegoPrincipal {
	static String palabraElegida;
	static String letra;
	static String guiones;
	static int longitudPalabra;

	//TODO: Preguntar si letra o palabra
	
	public static void main(String[] args) {
		palabraElegida = ListaPalabras.palabraAleatoria();
		longitudPalabra = palabraElegida.length();		
		System.out.println("La palabra es " + ListaPalabras.palabraAleatoria());
		guiones = ""; 
		 
		while(true ) {
			letra = VistaYTeclado.pedirLetra();
			System.out.println("La letra es " + letra);
			// guiones = "----------------------".substring(0, longitudPalabra); 
			if (palabraElegida.contains(letra)) {
				cuandoAciertaLetra();
			} else {
				System.out.println("No contiene");
			}
		}		
	}
	static void cuandoAciertaLetra() {
		int posicion;
		String letraPos;
		for (posicion = 0; posicion < longitudPalabra; posicion++) {
			letraPos = String.valueOf(palabraElegida.charAt(posicion));
			
			if (letra.equals(letraPos)) {
				System.out.println("pos: " + posicion + ", let: " +letraPos);
				guiones = guiones + letraPos;
			} else {
				guiones = guiones + "-";
			}
			System.out.println(guiones);
		}
	}
	void pruebasString() {
		/*System.out.println(palabraElegida.charAt(2));
		System.out.println("Indice: " + palabraElegida.indexOf(letra));*/
	}
}
