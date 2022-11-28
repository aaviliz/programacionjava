package Practica2;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int nA = (int)(Math.random()*(49+1-1))+1 ;
		 System.out.println("la solucion del apartado a es: " + nA);
		 
		int nB = (int)(Math.random()*(( 10 + 1- 1 ))+ 1)*2;
		System.out.println("la solucion del apartado b es: " + nB);
		 
		int nC = (int) ((float)(Math.random()*(10+1-1))+1);
		System.out.println("la solucion del apartado c es: " + nC);
		 
		int nD = (int)(Math.random()*((-50)+1-(-150)))+(-150);
		System.out.println("la solucion del apartado d es: " + nD);
		
		int nE = (int)(Math.random()*((-100)+1-10))+100;
		System.out.println("la solucion del apartado e es: " + nE);
		
		int nF = (int)(Math.random()*(5+1-1))+1;
		switch(nF) {
		case 1:
			System.out.println("5");
			break;
		case 2:
			System.out.println("7");
			break;
		case 3:
			System.out.println("33");
			break;
		case 4:
			System.out.println("125");
			break;
		case 5:
			System.out.println("77");
			break;
		}
		int nG = (int)(Math.random()*(12+1-1))+1;
		
		switch(nG) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septimebre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		
		}

	}

}
