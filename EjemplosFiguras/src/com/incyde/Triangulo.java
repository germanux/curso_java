package com.incyde;
import java.math.*;

public class Triangulo {
	public float[] longitudes;
	public float base;
	public float altura;
	public String color;

	public float perimetro() {
		
		return longitudes[0] + longitudes[1] + longitudes[2];
	}
	public float area() {
		return (this.base * this.altura) / 2f;
	}
	public void dibujar() {
		System.out.println("Dibujando " + toString());
	}
	public String toString() {
		return "Triangulo " + this.base + " x " + altura + " - Color: " + this.color ;
	}	
}
