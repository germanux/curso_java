package com.incyde;

import java.util.Scanner;

public class VistaYTeclado {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static String pedirLetra() {
		System.out.println("Introduzca una letra");
		String letraLeida = teclado.nextLine();
		return letraLeida.toLowerCase().trim();
	}
}
