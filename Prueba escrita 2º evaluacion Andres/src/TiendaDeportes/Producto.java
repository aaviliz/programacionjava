package TiendaDeportes;

import java.util.Objects;

public abstract class Producto implements Descontable {

	protected int codigo;
	protected String nombre;
	protected String descripcion;
	protected int precio;
	protected int unidadesStock;
	
	public Producto(int codigo, String nombre, String descripcion, int precio, int unidadesStock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadesStock = unidadesStock;
	}

	public Producto(Producto otro) {
		super();
		this.codigo = otro.codigo;
		this.nombre = otro.nombre;
		this.descripcion = otro.descripcion;
		this.precio = otro.precio;
		this.unidadesStock = otro.unidadesStock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getUnidadesStock() {
		return unidadesStock;
	}

	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", unidadesStock=" + unidadesStock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}
	
	public double descuento() {
		
		return precio;
		
	}
	
	
}
