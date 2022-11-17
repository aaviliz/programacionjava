package Tema2;

public class EjemploSwitch2 {

	public static void main(String[] args) {
		
		char operador;
		double operando1;
		double operando2;
		double res;
		
		operador= '+';
		operando1= 30;
		operando2= 5;
				
		
		
		switch (operador) {
		case '+': 
			res= operando1 + operando2;
			System.out.println(res);
			break;
		case '-': 
			res= operando1 - operando2;
			System.out.println(res);
			break;
		case '*': 
			res= operando1 * operando2;
			System.out.println(res);
			break;
		case '/': 
			res= operando1 - operando2;
			System.out.println(res);
			break;
		case '%': 
			res= operando1 - operando2;
			System.out.println(res);
			break;
		case 's': 
			Math.sin(operando1);
			System.out.println(Math.sin(operando1));
		break;	
		
		default:
			throw new IllegalArgumentException("Error" + operador);
		}
	
	}

}
