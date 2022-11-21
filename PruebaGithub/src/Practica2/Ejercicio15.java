package Practica2;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		double interes = 2000;
		double plazo = 2.75 / 100;
		double retenido = 18.0 / 100;
		double misIntereses;
		double interesesRetenidos;
		double misInteresesTotal;
		
		 misIntereses = interes * plazo / 2; 
		 System.out.println(misIntereses);
		 interesesRetenidos = misIntereses * retenido;
		 System.out.println(interesesRetenidos);
		 misInteresesTotal = misIntereses - interesesRetenidos;
		 System.out.println(misInteresesTotal);
		 
	}

}
