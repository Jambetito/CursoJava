package es.cursojava.inicio.bucles;

public class EjercicioBucles1 {

	public static void main(String[] args) {
		// Pintar la tabla de multiplicar de un numero
		
		int numero=3;
		
		for (int x=0;x<=10;x++) {
			System.out.printf("%02dx%02d: %03d\n",numero,x,(numero*x));
		}

	}

}
