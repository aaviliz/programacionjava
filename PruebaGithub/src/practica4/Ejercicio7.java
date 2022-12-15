package Practica4Ejs;

public class Ej7 {

	public static void main(String[] args) {
		
		int[]tabla = new int[10];
		
		for(int i=0; i<8;i++) {
			tabla[i] =(int)(Math.random()*10+1);
		}
		
		for(int i=0; i<tabla.length;i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println();
		
		int num=-1;
		int posicion=3;
		
		for(int i=tabla.length-1; i>posicion;i--) {
			tabla[i]=tabla[i-1];
		}
		
		tabla[posicion] =num;
		
		for(int i=0; i<tabla.length;i++) {
			System.out.print(tabla[i] +" ");
		}
	}
}
