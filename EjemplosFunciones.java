package com.mipaquete;

public class EjemplosFunciones {

	public static void main(String[] args) {
		System.out.println("V3 - Programa cine");
		// Empezando
		int x;
		int y;
		x = 3;
		y = 5;
		int resultadoSuma = sumarNumeros(x, y);
		int resultadoResta = restarNumeros(x, y);
		System.out.println("Resultado suma = " + resultadoSuma);
		System.out.println("Resultado resta = " + resultadoResta);
		System.out.println("Resultado cuadrado = " + alCuadrado(6));
		System.out.println("Resultado cuadrado = " + alCuadrado(y));
		System.out.println("Resultado cubo = " + alCubo(5));
	}
	public static double alCubo(int parametro) {
		double result = Math.pow(parametro, 3);
		return result;
	}
	public static int sumarNumeros(int valor_1, int valor_2) {
		System.out.println("Ahora si me verás!");
		return valor_1 + valor_2;
		//System.out.println("Nunca me verás!");
	}
	public static int restarNumeros(int valor_1, int valor_2) {
		return valor_1 - valor_2;
	}
	public static int alCuadrado(int v) {
		int resultado = v * v;
		return resultado;
	}
}
