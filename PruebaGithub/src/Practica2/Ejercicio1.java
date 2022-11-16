package Practica2;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int a=6 , b=2 , c=3;
		int res=0;
		
		res= (a * c) % c; // 0
		res= a * b / c; // 4
		res= c % b + c * b; // 7
		res= a % (a * b * c / (b + c)); // 6 
		res= b * b + c - b * (a % b); // 7
		
	}

}
