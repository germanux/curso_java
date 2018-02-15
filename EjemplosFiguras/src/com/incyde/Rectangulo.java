package com.incyde;

public class Rectangulo {
	public float base, altura;
	public String color;
	
	public float perimetro() {
		return base * 2 + altura * 2;
	}
	public float area() {
		return base * altura;
	}
	public void dibujar() {
		System.out.println("Dibujando " + toString());
	}
	public String toString() {
		return "Rectangulo "+base+"x"+altura+ " - Color: " + color ;
	}	
}
