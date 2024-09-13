package es.cursojava.inicio;

public class EjemplosString {
	
	public static void main (String[] args) {
		String m1 = "Hola";
		String m2 = "Hola";
		String m3 = new String("Hola");
		
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1.equals(m3));
		
		m1=m1.toUpperCase();
		
		
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println(m1+";"+m2);
	}

}
