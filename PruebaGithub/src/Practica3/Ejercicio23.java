package Practica3EJ;
import java.util.Scanner;
public class Ej23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, suma = 0, cantidad, mayor, menor;
		float media;

		System.out.println("Introduce un número: ");

		num = Math.abs(sc.nextInt());

		mayor = num;
		menor = num;
		cantidad = num;

		System.out.println("Introduce " + cantidad + " números: ");

		for (int i = 1; i <= cantidad; i++) {

			int numList = sc.nextInt();

			if (numList > mayor) {

				mayor = numList;
			}

			if (numList < menor) {

				menor = numList;
			}

			suma += numList;

		}
		
		media = suma / cantidad;

		System.out.println("La media es: " + media);
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);

	}

}
