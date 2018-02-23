package com.incyde.german.appjuegoahoracado;

import java.util.*;

public class ListaPalabras {
	
	static String[] palabras = {
			"aguila", 
			"pilum", 
			"gladius", 
			//"guion", 
			//"array",
			"hipopotomonstrosesquipedaliofobia"    };
	
	public static String palabraAleatoria() {
		// Buscamos un numero aleatorio y devolvemos la palabra
		// en esa posición
		Random objRandom = new Random();
		int indiceAleatorio = objRandom.nextInt(palabras.length);
		return palabras[indiceAleatorio]; 
	}
}
