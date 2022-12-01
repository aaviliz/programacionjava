package Tema2;

import java.util.Scanner;

public class EjemploMenu {

	public static void main(String[] args) {
		
		//1 .saludar
		//2. despedirse
		//3. derse la mano
		//4. salir

		int opcion = 0;
		//crear scanner
		Scanner sc = new Scanner(System.in);
		
		//bucle para repetir hasta q la opcion sea 4
		do {
			//pintar las opciones
			System.out.println("1. saludar");
			System.out.println("2. despedirse");
			System.out.println("3. darse la mano");
			System.out.println("4. salir");
			
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