package Practica3EJ;

import java.util.Scanner;
public class Ej22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num, i, numMayor;
		
		System.out.println("Dime un numero de 2 o 3 cifras");
		num= Integer.parseInt(sc.nextLine());
		
		numMayor=0;
		for (i=1; i<=num-1; i++) {
			if (num % i == 0) {
				numMayor = i;
			}
		}
		
		System.out.println("El divisor de " + num + " es: " + numMayor);

	}

}
