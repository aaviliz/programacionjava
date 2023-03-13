package TiendaDeportes;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Producto> inventario;
	private ArrayList<Compra> compras;
	
	public Tienda(ArrayList<Producto> inventario, ArrayList<Compra> compras) {
		super();
		this.inventario = inventario;
		this.compras = compras;
	}

	public ArrayList<Producto> getInventario() {
		return inventario;
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	} 
	
	public void addProducto(Producto p) {
		
	}
	
	public void delProducto(Producto p) {
		
	}
	
	public void addCompras(Compra c) {
		
	}
	
	public void buscarProducto(String texto) {
		
	}
	
	
}
