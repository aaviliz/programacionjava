package Practica3EJ;

import java.util.Scanner;
public class Ej17 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n1=0,n2=0;
		int i=0, contador;
		
		System.out.println("Dime un numero");
		
		try {
			n1=Integer.parseInt(sc.nextLine());
		}catch (Exception e) {
			System.out.println("Introduce un primer numero");
		}
		System.out.println("Dime otro numero");
		try {
			n2=Integer.parseInt(sc.nextLine());
		}catch (Exception o) {
			System.out.println("Introduce un segundo numero");
		}
		contador =0;
				for(i=n1+1;i<=n2-1;i++) {
					System.out.println(i);
					contador=contador +1;
				}
				System.out.println("Hay " + contador +" numeros");
		

	}

}
