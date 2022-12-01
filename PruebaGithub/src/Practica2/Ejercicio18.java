package Practica2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
	
		int a=10, b=3, d, e;
		
		boolean c = true;
		
		float x, y;
		
		x= (float) a / b;
		c = a < b && c;
		d = a + b++;
		e = ++a - b;
		
		
		System.out.println(x);
		System.out.println(c);
		System.out.println(d +" " + b );
		System.out.println(e + " " + a + " " + b);
		

		// lo q he hecho para q funcione es poner la variable c en boolean.
	}

}
