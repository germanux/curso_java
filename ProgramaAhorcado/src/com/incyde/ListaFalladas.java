package com.incyde;

import java.util.ArrayList;

public class ListaFalladas {
	
	private ArrayList<String> letrasFalladas;
	// Constructor
	public ListaFalladas() {		
		letrasFalladas = new ArrayList<String>();		
	}
	// Metodo para añadir letras
	public void agregarLetra(String letra) {
		letrasFalladas.add(letra);
	}
	// Metodo para devolver la lista letras
	public String[] devolverArray() {
		return (String[]) letrasFalladas.toArray();
	}
	public void mostrarLista() {
		System.out.println("Letras falladas: ");
		for (String letraFallo : letrasFalladas) {
			System.out.print(letraFallo + ", ");
		}
		System.out.println("");
	}
}
