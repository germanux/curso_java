package com.incyde;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(float lado) {
		this.altura = lado;
		this.base = altura;
		this.color = "transparente";
	}
	public Cuadrado(float lado, String color) {
		this.altura = lado;
		this.base = altura;
		this.color = color;
	} 
	public String toString() {
		return "Cuadrado " + base + " - Color: " + color ;
	}	
}
