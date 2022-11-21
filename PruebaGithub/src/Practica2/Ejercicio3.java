package Practica2;

public class Ejercicio3 {

	public static void main(String[] args) {

		boolean res;
		int a,b,c,d,e,f,g;
		
	/* a. a es mayor que 2.*/ res = a > 2;
	/* b. b es menor o igual que 25 pero mayor que 5.*/ res = (b <= 25) && (b > 5);
	/* c. c es mayor que 6 o igual a d.*/ res = (c > 6) || (c  == d);
	/* d. e es par menor que 50.*/ res = (e % 2 = 0) && (e < 50);
	/* e. f es mayor que a , b y c.*/ res = (f > a) && (f > b) && (f > c);
	/* f. g es igual a 3,4 ó 5.*/ res = (g == 3) || (g = 4) || (g = 5);

		
	}

}
