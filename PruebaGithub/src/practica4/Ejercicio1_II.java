package Practica4Ejs;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {

		Scanner numero = new Scanner( System.in );
		int num[]=new int[10];

		 for (int i=0;i<9;i++)
		 {
		 System.out.print("Introduzca un número: ");
		 num[i]=numero.nextInt();
		 System.out.println(num[i]);
	
		 }

		 System.out.println("Los números (en orden inverso):");
		 for (int i=9;i>=0;i--)
		 System.out.println(num[i]);
		
	}

}
