package Practica3EJ;
import java.util.Scanner;
public class Ej8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N;
		int doble;
		int triple;
		System.out.println("Dime un numero entero");
		N=sc.nextInt();
		doble=N*2;
		triple=N*3;
		System.out.println("Numero integrado: " + N);
		System.out.println("Doble de " + N + " -> " + doble);
		System.out.println("Triple de " + N + "  -> " + triple);
	}

}
