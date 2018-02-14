package com.incyde;

public class ClaseProgramaPrincipal {
	
	public static void main(String[] args) {
		Triangulo trianguloAngela = new Triangulo();		
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes;
		System.out.println("El perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 8f;
		System.out.println(trianguloAngela.toString());
		System.out.println("El area es " + trianguloAngela.area());
		
		Triangulo trianguloClase = new Triangulo();
		trianguloClase.base = 2f;
		trianguloClase.altura = 10f;
		System.out.println("El area del triangulo clase " + trianguloClase.area());
	}

}
