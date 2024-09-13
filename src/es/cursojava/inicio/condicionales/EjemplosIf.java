package es.cursojava.inicio.condicionales;

public class EjemplosIf {

	public static void main(String[] args) {

		int numero = 5;
		int nota = 9;
		
		if (numero%2 == 0) {
			System.out.println(numero + " es par.");
		}else {
			System.out.println(numero + " es impar.");
		}
		System.out.println("-----------------------");
		for (int x=0;x<=10;x++) {
			if (x%2 == 0) {
				System.out.println(x + " es par.");
			}else {
				System.out.println(x + " es impar.");
			}	
		}
		System.out.println("-----------------------");
		System.out.println(numero++);
		System.out.println(++numero);
		System.out.println(numero+=3);
		System.out.println("-----------------------");
		if (nota < 5) {
			System.out.println("["+nota+"]: Suspenso");
		}if (nota < 6) {
			System.out.println("["+nota+"]: Aprobado");
		}if (nota < 7) {
			System.out.println("["+nota+"]: Bien");
		}if (nota < 9) {
			System.out.println("["+nota+"]: Notable");
		}if (nota < 10) {
			System.out.println("["+nota+"]: Sobresaliente");
		}else {
			System.out.println("["+nota+"]: ERROR");
		}
		System.out.println("-----------------------");
		System.out.println("FIN");
	}

}
