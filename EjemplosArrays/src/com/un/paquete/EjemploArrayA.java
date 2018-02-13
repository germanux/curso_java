package com.un.paquete;

public class EjemploArrayA {
	
	public static void main(String[] args) {
		
		int[] arrayEnteros = new int[10];

		// Bucle for ( inicializacion;  condición;  iteración)
		for (int i = 0;   i < arrayEnteros.length; i++) { // i = i + 1
			arrayEnteros[i] = i * i;
			System.out.println("array(" + i + ") = " + arrayEnteros[i]);			
		}
		float[] decimales = new float[3];
		int j;
		for (j= 0; j < decimales.length; j++ ) {
			decimales[j] = (float) j / 3f;
			System.out.println("El tercio de " + j + " es " + decimales[j]);
		}
		int otroArray[] = { 5, 10, 15, 20, 25 };
		for (int elemento : otroArray) {
			System.out.println("Elemento = " + elemento);
		}	
		
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		for (String dia : dias) {
			System.out.println(dia);
		}		
		for (int d = 0; d < dias.length; d++) {
			String dia = dias[d];
			System.out.println(dia);
		}	
	}
	void mostrarDias () {		
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		int numDia = 2;
		while (numDia < dias.length) {
			System.out.println( dias [ numDia ] ) ;
			numDia = numDia + 1;
		}
	}
}
