/**
 * 
 */
package EjCuentaCorriente;

/**
 * @author usuario1daw
 *
 */
public class CuentaCorriente {
	
	private String numCuenta;
	private double saldo;
	
	public CuentaCorriente(double saldo) {
		super();
		this.numCuenta = CuentaCorriente.generalCuenta() ;
		this.saldo = saldo;
	}
	
	private static String generalCuenta() {
		StringBuilder builder= new StringBuilder();
		builder.append("ES00");
		int digito=0;
		for(int i =0; i<15; i++) {
			digito=(int)(Math.random()*10);
			
		}
		return builder.toString();
	}
	
	public void ingreso(double cantidad) {
		
		this.saldo=this.saldo+cantidad;
	}
	
	public int cargo(double cantidad) {
		
		double resultado=0;
		resultado=this.saldo-cantidad;
		if(resultado>0) {
			this.saldo=resultado;
			return 1;
		}else {
			return 0;
		}
		
	}

	public int transferencia(double cantidad, CuentaCorriente otraCuenta) {
		
		double resultado=0;
		resultado=this.saldo-cantidad;
		if(resultado>0) {
			this.saldo = resultado;
			otraCuenta.ingreso(cantidad);
			return 1;
		}else {
			return 0;
		}
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
