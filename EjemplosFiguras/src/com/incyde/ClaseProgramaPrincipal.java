package com.incyde;

public class ClaseProgramaPrincipal {

	public static void main(String[] args) {
		Triangulo[] triangulos;
		triangulos = new Triangulo[3];
		triangulos[0] = new Triangulo();
		triangulos[1] = new Triangulo();
		triangulos[2]  = new Triangulo();
		triangulos[2].base = 5;

		triangulos[0].color = "Blanco";
		triangulos[1].color = "Rojo";
		triangulos[2].color = "Amarillo";

		triangulos[0].dibujar();
		triangulos[1].dibujar();
		triangulos[2].dibujar();
	}
	
	public static void mainBasico() {
		Triangulo trianguloAngela = new Triangulo();		
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes;
		System.out.println("El perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 8f;
		trianguloAngela.color = "Rojo";
		System.out.println(trianguloAngela.toString());
		System.out.println("El area es " + trianguloAngela.area());
		
		Triangulo trianguloClase = new Triangulo();
		trianguloClase.base = 2f;
		trianguloClase.altura = 10f;
		trianguloClase.color = "Azul";
		trianguloClase.dibujar();
		System.out.println("El area del triangulo clase " + trianguloClase.area());
	}
}
