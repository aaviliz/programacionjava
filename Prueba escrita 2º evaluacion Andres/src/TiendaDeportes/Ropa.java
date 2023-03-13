package TiendaDeportes;

public class Ropa extends Producto {

	public Ropa(int codigo, String nombre, String descripcion, int precio, int unidadesStock) {
		super(codigo, nombre, descripcion, precio, unidadesStock);
		// TODO Auto-generated constructor stub
	}
	
	enum Talla { XS, S, M , L, XL, XLL}
	enum Tipo {Pantalon, Termica, Sudadera, Chandal}
	private Talla talla;
	private String color;
	private Tipo tipo;
	
	public Ropa(int codigo, String nombre, String descripcion, int precio, int unidadesStock, Talla talla, String color,
			Tipo tipo) {
		super(codigo, nombre, descripcion, precio, unidadesStock);
		this.talla = talla;
		this.color = color;
		this.tipo = tipo;
	}

	public Ropa(Ropa otra) {
		super(otra);
		this.talla = otra.talla;
		this.color = otra.color;
		this.tipo = otra.tipo;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", color=" + color + ", tipo=" + tipo + "]";
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
