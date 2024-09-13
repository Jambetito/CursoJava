package es.cursojava.inicio.bucles;

public class EjercicioBucles3 {

	public static void main(String[] args) {
		// Mostrar los 10 primeros n�meros de la Serie de Fibonacci
		//  0,1,1,2,3,5,8,13
		
		int A=0;
		int B=1;
		int contador=0;
		
		while (contador < 10) {
            System.out.print(A+ " ");

            int C = B + A;
            A = B;
            B = C;
            contador++;
        }

	}

}
