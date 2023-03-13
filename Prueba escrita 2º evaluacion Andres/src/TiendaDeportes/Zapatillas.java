package TiendaDeportes;

public class Zapatillas extends Producto{

	

	public Zapatillas(int codigo, String nombre, String descripcion, int precio, int unidadesStock) {
		super(codigo, nombre, descripcion, precio, unidadesStock);
		// TODO Auto-generated constructor stub
	}
	
	enum Numero{n35, n36, n37, n38, n39, n40, n41, n42, n43, n44, n45, n46, n47, n48, n49, n50}
	enum Categoria{runnig, walking, futblo, gimnasio, chanclas, trail, baloncesto, golf} 
	private Numero numero;
	private Categoria categaria;
	
	public Zapatillas(int codigo, String nombre, String descripcion, int precio, int unidadesStock, Numero numero,
			Categoria categaria) {
		super(codigo, nombre, descripcion, precio, unidadesStock);
		this.numero = numero;
		this.categaria = categaria;
	}

	
	public Zapatillas(Zapatillas otra) {
		super(otra);
		this.numero = otra.numero;
		this.categaria = otra.categaria;
	}
	
	public Numero getNumero() {
		return numero;
	}


	public void setNumero(Numero numero) {
		this.numero = numero;
	}


	public Categoria getCategaria() {
		return categaria;
	}


	public void setCategaria(Categoria categaria) {
		this.categaria = categaria;
	}

	@Override
	public String toString() {
		return "Zapatillas [numero=" + numero + ", categaria=" + categaria + "]";
	}

	public double descuento() {
		this.precio = (int) (this.precio * 0.03);
		return (double) - this.precio;
	}


	@Override
	public double descuesto() {
		
		return 0;
	}
}
