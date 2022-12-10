package Practica3EJ;

import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int numero=0;
		 System.out.println("Dime un numero de una cifra");
		 try {
			 numero =Integer.parseInt(sc.nextLine());
		 }catch (Exception e) {
			 System.out.println("Tiene que ser un numero");
		 }
		 
		 switch (numero) {
		 case 1:System.out.println("Uno");
		 break;
		 case 2: System.out.println("Dos");
		 break;
		 case 3:System.out.println("Tres");
		 break;
		 case 4: System.out.println("Cuatro");
		 break;
		 case 5:System.out.println("Cinco");
		 break;
		 case 6: System.out.println("Seis");
		 break;
		 case 7:System.out.println("Siete");
		 break;
		 case 8: System.out.println("Ocho");
		 break;
		 case 9:System.out.println("Nueve");
		 break;
		 case 10: System.out.println("Diez");
		 break;
		 }
		 if (numero<0) {
			 System.out.println("No se haceptan numerps negativos");
		 }
		 if (numero>10) {
			 System.out.println("Tiene que ser un numero de una cifra");
		 }
	}

}
