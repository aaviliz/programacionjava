package Practica2;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		double dimension=15.5;
		double altura=42.4;
		double resArea, resVolumen;
		double PI;
		
		PI=Math.PI;
		
		resArea=2*PI*dimension*(altura+dimension);
		
		resVolumen=PI*Math.pow(dimension,2)*altura;
		
		System.out.println("El area del cilindro es: " + resArea + " y su volumen es: " + resVolumen);
		
		
		

	}

}
