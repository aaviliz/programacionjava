package Tema2;

import java.util.Scanner;

public class EjempoCalculadora {

	
	
	public static void main(String[] args) {
		// Menu
		//1. sumar
		//2. restar
		//3.multiplicar
		//4.dividir
		
		//una vez pulsada una opcion, pedira dos numeros or teclado y hara la opcion correspondiente
		//pinta el resultado
		
		int opcion = 0;

		Scanner sc = new Scanner(System.in);
		do {
			
		
			System.out.println("1. sumar");
			System.out.println("2. restar");
			System.out.println("3. multiplicar");
			System.out.println("4. dividir");
			
			//pide q el usuario eleja su opinion
			System.out.println("dime la opcion a eleges: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				opcion = 0;
			}
			//haria acciones en funcion de la opcion elegida
			switch (opcion) {
				case 1:
					System.out.println("Hola que tal!");
					break;
				case 2:
					System.out.println("Hasta la prosima");
					break;
				case 3:
					System.out.println("Encantado UwU");
					break;
				case 4:
					System.out.println("Adios! Apagando el sistema");
					break;
			}
			
		}while (opcion != 4);

	}
}
