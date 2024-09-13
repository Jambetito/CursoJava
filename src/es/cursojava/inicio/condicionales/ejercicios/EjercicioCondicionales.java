package es.cursojava.inicio.condicionales.ejercicios;

public class EjercicioCondicionales {

	public static void main(String[] args) {
		
		String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		
		
		for (int i=0;i<=mes.length-1;i++) {
			System.out.println("["+i+"]--------------------------------------------------------------");
			if (mes[i] == "enero" || mes[i] == "febrero" || mes[i] == "marzo"){
				System.out.println("["+mes[i]+"]: INVIERNO");
			}else if (mes[i] == "abril" || mes[i] == "mayo" || mes[i] == "junio"){
				System.out.println("["+mes[i]+"]: PRIMAVERA");
			}else if (mes[i] == "julio" || mes[i] == "agosto" || mes[i] == "septiembre"){
				System.out.println("["+mes[i]+"]: VERANO");
			}else if (mes[i] == "octubre" || mes[i] == "noviembre" || mes[i] == "diciembre"){
				System.out.println("["+mes[i]+"]: OTOÑO");
			}else {
				System.out.println("["+mes[i]+"]: ERROR MES");
			}
			
			switch (mes[i]) {
			case "enero", "febrero", "marzo": 
				System.out.println("["+mes[i]+"]: INVIERNO");
				break;
			case "abril","mayo","junio":
				System.out.println("["+mes[i]+"]: PRIMAVERA");
				break;
			case "julio","agosto","septiembre":
				System.out.println("["+mes[i]+"]: VERANO");
				break;
			case "octubre","noviembre","diciembre":
				System.out.println("["+mes[i]+"]: OTOÑO");	
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + mes[i]);
			}
		}
		

	}

}
