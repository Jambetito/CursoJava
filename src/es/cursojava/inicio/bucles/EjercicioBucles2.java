package es.cursojava.inicio.bucles;

public class EjercicioBucles2 {

	public static void main(String[] args) {
		// Pintar las tablas de multiplicar de los numeros del 1-10

		for (int y=1;y<=10;y++) {
			System.out.println("-------------- TABLA DEL "+y+" --------------");
			for (int x=0;x<=10;x++) {
				System.out.printf("%02dx%02d: %03d\n",y,x,(y*x));
			}
		}
	}

}
