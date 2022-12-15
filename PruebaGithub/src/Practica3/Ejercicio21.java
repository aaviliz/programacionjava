package Practica3EJ;
import java.util.Scanner;
public class Ej21 {

	public static boolean esPrimo(int num) {

		if (num== 0 || num ==1 || num==4) {
			return false;
		}
		
		for (int i=2; i<num; i++) {
			if (num % i ==0) {
				return false;
			}
		}
		
		return true;
	}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int num = 0;
			
			System.out.println("Dime un numero");
			try {
				num=Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				System.out.println("He dicho un numero");
			}
			
			if (esPrimo(0) == true) {
				System.out.println("El numero es primo");
			}else {
				System.out.println("El numero no es primo");
			}

	}

}
