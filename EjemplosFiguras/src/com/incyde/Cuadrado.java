package com.incyde;

public class Cuadrado {
	public float lado;
	public String color;
	
	public float perimetro() {
		return lado * 4;
	}
	public float area() {
		return lado * lado;
	}
	public void dibujar() {
		System.out.println("Dibujando " + toString());
	}
	public String toString() {
		return "Cuadrado " + lado + " - Color: " + color ;
	}	
}
