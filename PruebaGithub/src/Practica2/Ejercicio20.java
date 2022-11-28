package Practica2;

public class Ejercicio20 {

	public static void main(String[] args) {
		int n1, n2, n3 ,a = 2,b = 2,d = 2;
		
		n1 = (int) ((int) ((int) (5*Math.pow(a,2)) * Math.pow(b,3)) + Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
		System.out.println(n1);
		
		n2 = (int)(int) Math.sqrt(4 * a*Math.pow(b,2) + Math.pow((a + b),2));
		System.out.println(n2);
		
		n3 = (int) ((int) ((int) Math.pow(a,3) * b / 2 * a * Math.pow(b,2)) - Math.sqrt(12 * Math.pow(d,4)));
		System.out.println(n3);
	}

}
