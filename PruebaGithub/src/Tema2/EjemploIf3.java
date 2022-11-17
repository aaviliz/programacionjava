package Tema2;

public class EjemploIf3 {

	public static void main(String[] args) {
		
		double nota1 ,  nota2 , nota3 , notaEx , notaFinal;
		double mediaPractica;
		
		nota1 = 5;
		nota2 = 0;
		nota3 = 6;
		notaEx = 4;
		
		mediaPractica = (nota1 + nota2 + nota3) / 3;
		notaFinal = (mediaPractica * 0.6) + (notaEx * 0.4);
				
		
		if (mediaPractica < 3) {
			System.out.println("suspenso");
		}else if (notaEx < 3) {
			System.out.println("suspenso");
		}else if(notaFinal < 5) {
			System.out.println("suspenso");
		}else if(notaFinal >= 5 && notaFinal <=8) {
			System.out.println("notable");
		}else if (notaFinal > 8) {
			System.out.println("sobresaliente");
		}
	}

}
