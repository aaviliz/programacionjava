package TiendaDeportes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Compra implements Enviable {

	private ArrayList<LineaCompra> LineaCompra;
	private LocalDateTime fecha;
	private int precioTotal;
	
	public Compra(LocalDateTime fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Compra [LineaCompra=" + LineaCompra + ", fecha=" + fecha + ", precioTotal=" + precioTotal + "]";
	}

	public void addLinia(LineaCompra lc) {
		
	}
	
	public void delLinia(LineaCompra ls) {
		
	}
	
	public void crearEmai() {
		
	}

	@Override
	public String crearEmail() {
		return null;
	}
}
