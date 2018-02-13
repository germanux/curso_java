package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {
	static float capital;
	static float precio = 7.5f;
	static int horaIda;
	static int horaPase_1 = 7;
	static int horaPase_2 = 9;
	static int horaRecomendada;
	static Scanner teclado;

	public static void main(String[] args) {
		boolean resultadoCine;
		String siContinuar;
		teclado = new Scanner(System.in);
		System.out.println("Programa Cine V4");		
		do {
			pedirDatosDinero();
			pedirDatosHora();
			resultadoCine = comprobarSiVamosAlCine();
			mostrarResultado(resultadoCine);
			System.out.println("Desea continuar? (s/n)");
			teclado.nextLine();
			siContinuar = teclado.nextLine();
		} while (siContinuar.equals("s") || siContinuar.equals("S"));
		teclado.close();
		System.out.println("Fin del programa");		
	}
	public static void pedirDatosDinero() {
		System.out.println("Introduzca su dinero:");
		capital = teclado.nextFloat();
	}
	public static void pedirDatosHora() {
		System.out.println("Introduzca la hora de ida:");
		horaIda = teclado.nextInt();
	}
	public static boolean comprobarSiVamosAlCine() {
		if (capital >= precio) {
			if (horaIda >= horaPase_1 - 1 && horaIda <= horaPase_1) {
				horaRecomendada = horaPase_1;
				return true;
			} else if (horaIda >= horaPase_2 - 1 && horaIda <= horaPase_2) {
				horaRecomendada = horaPase_2;
				return true;		
			}
		}
		return false;
	}
	public static void mostrarResultado(boolean resultado) {
		if (resultado == true) {
			System.out.println("La hora recomenda es " + horaRecomendada);
			System.out.println("SÍ que podemos ir al cine");
		} else {
			if (capital < precio) {
				System.out.println("NO podemos ir al cine porque la entrada vale " + precio);
			} else {
				System.out.println("NO podemos ir al cine");
			}
		}
	}
}