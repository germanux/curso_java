/*	Fichero: ProgramaCine.java
	Autor: German Caballero
	Descripcion: Programa para saber si vamos al cine
*/
public class ProgramaCine 
{	
	// Metodo principal, que se llama al arrancar el programa
	public static void main(String[] argumentos)
	{
		// Asignamos variables
		String titulo;	// Titulo en variable de texto
		titulo = "Torrente 8";
		boolean varSiIrAlCine = false;	// Resultado para saber si ir al cine en bool
		int precioEntrada = 9;			// Precio entrada
		int nuestroCapital = 5;		// El dinero que tenemos
		
		// Instrucciones de salida por consola
		System.out.println ("PROGRAMA CINE");
		
		// Imprimimos el titulo
		System.out.println ("Titulo: " + titulo + ".");
		
		// Lógica del dinero
		System.out.println ("Precio: " + precioEntrada);
		if (nuestroCapital > precioEntrada) 
			varSiIrAlCine = true;
		else  
			varSiIrAlCine = false;
		
		if (varSiIrAlCine == true) {
			System.out.println ("SI Podriamos ir al cine");
			nuestroCapital = nuestroCapital - precioEntrada;
		} else {
			System.out.println ("NO Podriamos ir al cine");
		}
		System.out.println ("Capital final: " + nuestroCapital);
	}
}

