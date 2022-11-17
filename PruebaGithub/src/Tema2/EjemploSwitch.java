package Tema2;

public class EjemploSwitch {

	public static void main(String[] args) {
		
		int diaSemana =5;
		
		switch (diaSemana) {
		case 1: 
			System.out.println("lunes");
			break;
		case 2: 
			System.out.println("martes");
			break;
		case 3: 
			System.out.println("miercoles");
			break;
		case 4: 
			System.out.println("jueves");
			break;
		case 5: 
			System.out.println("viernes");
			break;	
		case 6: 
			System.out.println("savado");
			break;
		case 7:
			System.out.println("damindo");
			break;
		default:
			throw new IllegalArgumentException("dia de la semana incorecto" + diaSemana);
		}

	}

}
