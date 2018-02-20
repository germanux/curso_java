package com.incyde;

public abstract class Figura {
	public String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public void dibujar() {
		System.out.println("Dibujando " + toString());
	}
	public void dibujar(String texto) {
		System.out.println(texto + toString());
	}
}
