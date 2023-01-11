/**
 * 
 */
package EjEmpleado;

/**
 * @author usuario1daw
 *
 */
public class Aplicacion {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Manuel", "Diaz Martiniz", 40, "manu123@gmail.com", 2100, 0.22, 0.06, "Recursos Humanos"); 
		Empleado emp2 = new Empleado("Elena", "Lopez Lopez", 40, "elem123@gmail.com",2100, 0.19, 0.05, "Recursos Humanos");
		
		System.out.println(emp1.getNombre()+" gana "+emp1.mostrarSalarioActual());
		System.out.println(emp2.getNombre()+" gana "+emp2.mostrarSalarioActual());
		
		
	}
}
