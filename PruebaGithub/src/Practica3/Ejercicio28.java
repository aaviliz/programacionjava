package Practica3EJ;
import java.util.Scanner;
public class Ej28 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre de la primera persona:");
		String nombrePersonaI = sc.nextLine();
		
		System.out.println("Introduzca el primer apellido: ");
		String apellidoIPersonaI = sc.nextLine();
		
		System.out.println("Introduzca el segundo apellido: ");
		String apellidoIIPersonaI = sc.nextLine();

		System.out.println("Introduzca el nombre de la segunda persona: ");
		String nombrePersonaII = sc.nextLine();
		
		System.out.println("Introduzca el primer apellido: ");
		String apellidoIPersonaII = sc.nextLine();
		
		System.out.println("Introduzca el segundo apellido: ");
		String apellidoIIPersonaII = sc.nextLine();

		if ((apellidoIPersonaI.compareToIgnoreCase(apellidoIPersonaII) < 0) || (apellidoIPersonaI.equalsIgnoreCase(apellidoIPersonaII)
			&& apellidoIIPersonaI.compareToIgnoreCase(apellidoIIPersonaII) < 0) || (apellidoIPersonaI.equalsIgnoreCase(apellidoIPersonaII)
			&& apellidoIIPersonaI.equalsIgnoreCase(apellidoIIPersonaII) && nombrePersonaI.compareToIgnoreCase(nombrePersonaII) < 0)) {
			System.out.println(apellidoIPersonaI + "" + apellidoIIPersonaI + "" + nombrePersonaI);
			System.out.println(apellidoIPersonaII + "" + apellidoIIPersonaII + "" + nombrePersonaII);
		} else {
			System.out.println(apellidoIPersonaII + "" + apellidoIIPersonaII + "" + nombrePersonaII);
			System.out.println(apellidoIPersonaI + "" + apellidoIIPersonaI + "" + nombrePersonaI);
		}

	}

}
