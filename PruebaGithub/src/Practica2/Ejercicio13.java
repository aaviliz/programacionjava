package Practica2;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int segundos = 20000;
		int horas = segundos / 3600;
		segundos %= 3600;
		int minutos = segundos / 60;
		segundos %= 60;
	
		 System.out.println("Horas: " + horas);
	     System.out.println("Minutos: " + minutos);
	     System.out.println("Segundos: " + segundos);	
	}
}
