package com.incyde;

public class Triangulo extends Figura{
	public float[] longitudes;
	public float base;
	public float altura;

	public Triangulo(float base, float altura) {
		super("transparente");
		this.base = base;
		this.altura = altura;
		color = "transparente";
	}
	public Triangulo(float base, float altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public float perimetro() {		
		return longitudes[0] + longitudes[1] + longitudes[2];
	}
	public float area() {
		return (this.base * this.altura) / 2f;
	}
	public String toString() {
		return "Triangulo " + this.base + " x " + altura + " - Color: " + this.color ;
	}	
}
