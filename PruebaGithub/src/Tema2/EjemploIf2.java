package Tema2;

public class EjemploIf2 {

	public static void main(String[] args) {
		
		int edad=20 ;
		char sexo='H';
		
		if ( (edad >= 0 && edad <= 11)) {
			if (sexo == 'H') {
				System.out.println("ninio");
			}else if (sexo == 'M') {
				System.out.println("ninia");
			}
		}else if (edad >= 12 && edad <= 18){
			System.out.println("adolescete");
		}else if (edad >= 19 && edad <= 29){
			System.out.println("joven");
		}else if (edad >= 30 && edad <= 55){	
			if (sexo == 'H') {
				System.out.println("hombre");
			}else if (sexo == 'M') {
				System.out.println("mujer");
			}
		}else if (edad >= 56 && sexo =='H') {
			System.out.println("viejo");
		}else if (edad >= 56 && sexo == 'M') {
			System.out.println("vieja");
		}else {
			System.out.println("datos incarrectos");
		}
	}
}
