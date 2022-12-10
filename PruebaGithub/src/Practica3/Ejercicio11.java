package Practica3EJ;
import java.util.Scanner;
public class Ej11 {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				int numero=0, resto=0;
				int contador;
				
			
				System.out.println("Dime un numero");
				try {
					numero=Integer.parseInt(sc.nextLine());
				}catch (Exception e) {
					System.out.println("Escribe un numero");
				}
				
			
				contador=0;
				
				resto = numero/10;
				contador=contador+1;
				
				for (int i = 1; resto>0; i++) {
					if (resto > 0) {
						resto = resto/10;
						contador=contador+1;
					}
					
				}
				
				System.out.println("Tiene un total de " + contador + " cifras");

	}

}
