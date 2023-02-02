package primeraevaluecion;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		String mensaje;
		int codigo;
		char opcion;
		
		//Introducir texto
		do {
			
		System.out.println("Dime un texto");
		mensaje= entrada.nextLine();
		
		}while (mensaje.isEmpty());
		
		//Introducir codigo
		do {
			
			System.out.println("Dime el codigo");
			codigo= entrada.nextInt();
		}while (codigo < 1);
		
		//Introducir la opcion a realizar: cifrar o descifrar
		do {
			
			entrada.nextLine();
			System.out.print("Escoja (C) cifrar o (D) descifrar ");
			opcion = (char) System.in.read();
			
		}while (Character.toUpperCase(opcion) != 'C' && Character.toTitleCase(opcion) != 'D');
		
		if(Character.toUpperCase(opcion) == 'C') {
			System.out.println("Texto cifrado: " + cifradoRielCesar(mensaje,codigo));
		}else {
			System.out.println("Texto descifrado: " + cifradoRielCesar(mensaje,codigo));
		}
	}	
		//Metodo cifrar texto
		public static String cifradoRielCesar(String mensaje, int codigo) {
			
			StringBuilder cifrado = new StringBuilder();
			
			codigo = codigo % 27;
			
			for(int i=0;i< mensaje.length();i++) {
				if(mensaje.charAt(i)>= 'a' &&  mensaje.charAt(i)<='z') {
					if((mensaje.charAt(i) + codigo) > 'z') {
						cifrado.append((char) (mensaje.charAt(i) + codigo -27)); 
					}else {
						cifrado.append((char) mensaje.charAt(i) + codigo);
					}
				} else if (mensaje.charAt(i)>= 'A' && mensaje.charAt(i)<= 'Z') {
					if((mensaje.charAt(i)+ codigo) > 'Z') {
						cifrado.append((char) (mensaje.charAt(i) + codigo - 27));
					}else {
						cifrado.append((char) (mensaje.charAt(i) + codigo));
					}
				}
			}
			return cifrado.toString();
	}

		//Metodo para descodificar texto
		public static String descifradoRielCesar(String mensaje, int codigo) {
			
			StringBuilder cifrado = new StringBuilder();
				
			codigo = codigo % 27;
			
			for(int i=0;i< mensaje.length();i++) {
				if(mensaje.charAt(i)>= 'a' &&  mensaje.charAt(i)<='z') {
					if((mensaje.charAt(i) + codigo) > 'z') {
						cifrado.append((char) (mensaje.charAt(i) - codigo -27)); 
					}else {
						cifrado.append((char) mensaje.charAt(i) - codigo);
					}
				} else if (mensaje.charAt(i)>= 'A' && mensaje.charAt(i)<= 'Z') {
					if((mensaje.charAt(i)+ codigo) > 'Z') {
						cifrado.append((char) (mensaje.charAt(i) - codigo  -27));
					}else {
						cifrado.append((char) (mensaje.charAt(i) - codigo));
					}
				}
			}
			return cifrado.toString();
		}
			
}
