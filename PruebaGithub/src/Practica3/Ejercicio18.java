package Practica3EJ;

import java.util.Scanner;
public class Ej18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=0;
		int numMax=0, numMin=100;
		
		System.out.println("Dime un nuemro");
		try {
			num=Integer.parseInt(sc.nextLine());
		}catch (Exception e) {
			System.out.println("Dime un numero correcto");
		}
		
		while (num!=0) {
			System.out.println("Dime un numero");
			try {
				num=Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				System.out.println("Dime un numero correcto");
			}
			if(num==0) {
				System.out.println("Terminastes");
			}
			if ((num<numMin)&&(num!=0)) {
				numMin=num;
			}else if (num>numMax) {
				numMax=num;
			}
		}
		
		System.out.println("El numero nemos es: " + numMin);
		System.out.println("El numero mayor es: " + numMax);
	}

}
