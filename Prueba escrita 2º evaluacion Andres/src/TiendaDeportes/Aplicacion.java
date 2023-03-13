package TiendaDeportes;
import java.util.Scanner;
public class Aplicacion {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		boolean salir=false;
		int opcion = 0;
		while(!salir) {
			
			System.out.println("1. Mostrar Inventario");
			System.out.println("2. Buscar Producto");
			System.out.println("3. Mostrar Compras");
			System.out.println("4. Mostrar Compras por mer");
			System.out.println("5. Hacer Compras");
			System.out.println("6. Salir");
			
			System.out.println("Dime una de las opcines a desear");
			opcion= sn.nextInt();
			
			switch(opcion) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("Gracias por su compra.");
				salir= true;
				break;
			default: 
				System.out.println("Opcion inesistente, introduzca una nueva");
			}
		}
	}

}
