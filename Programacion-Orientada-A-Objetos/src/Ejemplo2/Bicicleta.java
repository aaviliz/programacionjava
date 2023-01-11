/**
 * 
 */
package Ejemplo2;

/**
 * @author usuario1daw
 *
 */
public class Bicicleta {

	
	public boolean esElectica;
	public String marca;
	public String frenos;
	public String cambios;
	public String orquilla;
	public String material;
	public double precio;
	
	public Bicicleta(boolean esElectica, String marca, String frenos, String cambios, String orquilla, String material,
			double precio) {
		
		super();
		
		this.esElectica = esElectica;
		this.marca = marca;
		this.frenos = frenos;
		this.cambios = cambios;
		this.orquilla = orquilla;
		this.material = material;
		this.precio = precio;
	}
	
	public Bicicleta() {
		
		super();
		
		this.esElectica = false;
		this.marca = "No tiene marca";
		this.precio = 1000;
		this.frenos = "";
		this.cambios = "";
		this.orquilla = "";
		this.material = "Aluminio";
	}
	
	public double precioDescuento() {
		double precioDescuento=0;
		
		if(this.esElectica == true) {
			precioDescuento = this.precio * 0.85;
		}else {
			precioDescuento = this.precio * 0.95;
		}
		
		return precioDescuento;
	}
}
