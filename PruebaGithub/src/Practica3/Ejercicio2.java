package Practica3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numero, multiplo;
        System.out.println("Ingresa un numero: ");
        numero = sc.nextInt();
        System.out.println("Ingresa un multiplo: ");
        multiplo = sc.nextInt();
        if (numero % multiplo == 0) {
            System.out.printf("%d es multiplo de %d", numero, multiplo);
        } else {
            System.out.println("No es multiplo");
        }

	}

}
