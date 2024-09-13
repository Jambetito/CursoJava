package es.cursojava.inicio;

public class Variables {
	
	public static void main (String[] args) {
		//Tipos primitivos
		byte num1 = 1; // -128 a 127
		short num2 = 2; // -32,768 a 32,767
		int num3 = 7; // -2,147,483,648 a 2,147,483,647 
		long num4 = 5; // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 
		
		double numeroDecimal1 = 7.5;
		float numeroDecimal2 = 7.5f;
		
		boolean esMayorEdad = false;
		
		char caracter = 'a';
		
		//Tipos Objetos
		String nombre = "Jose Luis";
		int[] notas = {7,9,4,5,6,9};

		System.out.println(nombre + num3 + 3);
		System.out.println(num3 + 3);
	}

}
