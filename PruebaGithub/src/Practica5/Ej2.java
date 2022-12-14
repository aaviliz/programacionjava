package Practica5;

import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		
		String palabra=" ";
		
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Introduce una palabra");

		try{
			palabra = sc.nextLine();
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//girrar la cadena
		StringBuffer sb = new StringBuffer(palabra);
		sb.reverse();
	}

}
