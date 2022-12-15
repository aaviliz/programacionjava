package primeraevaluacion;

public class Ejercicio2 {

	public static void main(String[] args) {


		int dado1 = 0;
		int dado2 = 0;
		int suma;
	
	
		
		/*dado1=(int) (Math.random() * 6);
		System.out.println("la tirtada del 1 a salido un: " + dado1);
		dado2=(int)(Math.random()*6);
		System.out.println("la tirtada del 2 a salido un: " + dado2);
		suma=dado1+dado2;
		System.out.println("la suma de las tiradas es: "+suma);
		
		System.out.println(" ");*/ //Otra forma de haver , aunque no se si bien
		
		
		if( dado1 < 6){
			dado1=(int) (Math.random()*6);
			System.out.println("la tirtada del 1 a salido un: " + dado1);
		}if (dado2 < 6) {
			dado2=(int)(Math.random()*6);
			System.out.println("la tirtada del 2 dado a salido un: "+dado2);
		}
		suma = dado1+dado2;
		System.out.println("la suma de las tiradas es: "+suma);
		
		
	}

}
