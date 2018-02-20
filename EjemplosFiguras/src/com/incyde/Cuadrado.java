package com.incyde;

public class Cuadrado extends Rectangulo {

	public Cuadrado(float lado) {
		super(lado,  lado);
	}
	public Cuadrado(float lado, String color) {
		super(lado, lado, color);
	} 
	public String toString() {
		return "Cuadrado " + base + " - Color: " + color ;
	}	
}
