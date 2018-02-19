package com.incyde;

public class Rectangulo extends Figura {
	public float base, altura;
	
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
