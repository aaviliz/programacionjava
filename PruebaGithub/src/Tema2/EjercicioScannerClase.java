package Tema2;

import java.util.Scanner;

public class EjercicioScannerClase {

	public static void main(String[] args) {
		
		// 1. leer de teclado el nombre de un empleado
		// 2. leer de teclado el sueldo bruto del empleado
		// 3. leer de teclado el irpf que se le va a aplicar (18,12,20...)
		// 4. resultado debe ser el sueldo neto del empleado
		// sueldoNeto = sueldo - (sueldo *  irpf/100)

		String nombre = "";
		double sueldoBruto = 0;
		int irpf = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Dime nombre empleado: ");
			nombre = sc.nextLine();
			System.out.println("Dime sueldo mensual bruto: ");
			sueldoBruto = Double.parseDouble(sc.nextLine());
			System.out.println("Dime el irpf a aplicar");
			irpf = Integer.parseInt(sc.nextLine());
		}catch (Exception e) {
			System.out.println();
		}
		
	
	}

}
