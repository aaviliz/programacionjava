package Practica3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
			int numero = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Dime un numero para crear la figura");
			try {
				numero = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error no me has escrito un numero");
			}
			
			
			for(int j=1; j <= numero; j++) {
				
				for(int i=1; i <= j; i++) {
					System.out.print("*");				
				}
				
				System.out.println();
				
				
				}
			
			
			}

}
