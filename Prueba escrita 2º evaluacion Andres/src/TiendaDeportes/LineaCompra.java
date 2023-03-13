package TiendaDeportes;

import java.util.Objects;

public class LineaCompra {

	private int orden;
	private String Producto;
	private int cantidad;
	private int precio;
	
	
	public LineaCompra(int orden, String producto, int cantidad) {
		super();
		this.orden = orden;
		this.Producto = producto;
		this.cantidad = cantidad;
	}


	public int getOrden() {
		return orden;
	}


	public void setOrden(int orden) {
		this.orden = orden;
	}


	public String getProducto() {
		return Producto;
	}


	public void setProducto(String producto) {
		Producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Producto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaCompra other = (LineaCompra) obj;
		return Objects.equals(Producto, other.Producto);
	}

	public double subtotal() {
		Object subtotal = (this.precio*this.cantidad)-descuento();
		return (double) subtotal;
		
	}

	private int descuento() {
		return 0;
	}
		
	

	
}
