package Practica3EJ;

import java.util.Scanner;
public class Ej20 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int num = 0, i;
			
			System.out.println("Dime un numero");
			try {
				num=Integer.parseInt(sc.nextLine());
			}catch (Exception e){
				System.out.println("Dime un numero entero");
			}
			
			for (i=1; i==100; i++) {
				if (num%i == 0) {
					System.out.println("El numero " + num + " es divisible entre " + i );
				}else {
					System.out.println("El numero no es divisor de " + i);
				}
			}
	}

}
