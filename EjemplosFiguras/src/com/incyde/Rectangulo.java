package com.incyde;

public class Rectangulo extends Figura {
	public float base, altura;

	public Rectangulo(float base, float altura) {
		super("Transparente");
		this.base = base; 
		this.altura = altura; 
	}
	public Rectangulo(float base, float altura, String color) {
		super(color);
		this.base = base; 
		this.altura = altura; 
	}
	public float perimetro() {
		return base * 2 + altura * 2;
	}
	public float area() {
		return base * altura;
	}
	public String toString() {
		return "Rectangulo "+base+"x"+altura+ " - Color: " + color ;
	}	
}
