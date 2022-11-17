package Tema2;

public class ejemploIf {

	public static void main(String[] args) {
		
		double variablePrecio= 295 , variableIva= 1.25 , total= 0;
		int variableCantidad= 4;
		
	
	
		if (variableCantidad >=5) {
			total = variablePrecio * variableCantidad;
			
		}else {
			total = (variablePrecio * variableIva);
		}
		System.out.println(total);

	}

}
