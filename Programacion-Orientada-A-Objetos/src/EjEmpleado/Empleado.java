/**
 * 
 */
package EjEmpleado;

/**
 * @author usuario1daw
 *
 */
public class Empleado {

	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	private double salarioBruto;
	private double irpf;
	private double seguridadSocial;
	private String departamento;
	
	public Empleado() {
		
		super();
		
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.email = "";
		this.salarioBruto = 0;
		this.irpf = 0;
		this.seguridadSocial = 0;
		this.departamento = "";
	}

	public Empleado(String nombre, String apellidos, int edad, String email, double salarioBruto, double irpf,
			double seguridadSocial, String departemento) {
		
		super();
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.salarioBruto = salarioBruto;
		this.irpf = irpf;
		this.seguridadSocial = seguridadSocial;
		this.departamento = departemento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public double getSeguridadSocial() {
		return seguridadSocial;
	}

	public void setSeguridadSocial(double seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double mostrarSalarioActual() {
		double salarioActual;
		
		salarioActual = (this.salarioBruto * this.irpf) + ( this.salarioBruto * this.seguridadSocial);
		
		return (this.salarioBruto - salarioActual);
	}
	
}
