package com.incyde;

public class JuegoPrincipal {
	static String palabraElegida;
	static String letra;
	static String guiones;
	static int longitudPalabra;

	public static void main(String[] args) {
		palabraElegida = ListaPalabras.palabraAleatoria();
		System.out.println("La palabra es " + ListaPalabras.palabraAleatoria());
		letra = VistaYTeclado.pedirLetra();
		System.out.println("La letra es " + letra);
		longitudPalabra = palabraElegida.length();
		guiones = "_ _ _ _ _ _ _ _ _ _ _ ".substring(0, longitudPalabra * 2);
		System.out.println(guiones);
		
	}
	void pruebasString() {
		/*System.out.println(palabraElegida.charAt(2));
		if (palabraElegida.contains(letra)) {
			System.out.println("Si que contiene");
		} else {
			System.out.println("No contiene");
		}
		System.out.println("Indice: " + palabraElegida.indexOf(letra));*/
	}
}
