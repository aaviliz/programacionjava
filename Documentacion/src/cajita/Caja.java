package cajita;

/**
 * 
 * @author usuario1daw
 * @since marzo 2023
 * @version 1.0
 * <h1>clase cajaregistradora</h1>
 *<h2>Documentacion JavaDoc</h2>
 *
 *se utilizara para representar objetos de tipo <b>caja.</b>
 *los atributos de la calse seran:
 *
 *<ul>
 *	<li>capacidadMaxima</li>
 *	<li>capacidadActual</li>
 *</ul>
 *
 */
public class Caja {
	
	//Atributos:
	
	//1- de clase (static)
	private static int numCajas;
	//2- de instancia
	private int capacidadMaxima;
	private int cantidadActual;
	

	/**
	 * Constructor predeterminado
	 * Crea una caja con las siguienres caracteristicas:
	 * 
	 * <ul>
	 * 	<li>Capacidad max = 500€
	 * 	<li>Cantidad actual = 0€<li>
	 * <ul>
	 * 
	 */
	public Caja(){
	this(500, 0);
}

	/**
	 * Contructor con 1 parametro
	 * 
	 * @param capacidadMax
	 * 
	 * Se crea una caja con las siguientes caracteristicas:
	 * 
	 * <ul>
	 * 	<li>Capacidad max = valor pasado como primer paramatro<li>
	 * 	<li>Cantidad actual = valor pasado como primer parametro<li>
	 * <ul>
	 * 
	 * Si la cantidad actual es mayor que la capacidad max, se ignora las cantidades
	 * para dejarr la caja llena. No puede ser superior la cantidad actual que la capacidad max.
	 * 
	 */
public Caja(int capacidadMax){
	this(capacidadMax,capacidadMax);
}

public Caja(int capacidadMax, int cantidadActual){
	this.capacidadMaxima = capacidadMax;
	this.cantidadActual = cantidadActual;
	if(cantidadActual > capacidadMax){
		this.cantidadActual = capacidadMax;
	}
	numCajas++;
}

	// Getters 

public int getCapacidadMaxima() {
	return capacidadMaxima;
}

public int getCantidadActual() {
	return cantidadActual;
}

	//Metodos

	/**
	 * 
	 * El metodo llenarCaja() hace que la cantidad actual sea igual a la capacidad max
	 * 
	 * De esta forma se consigue llenar la caja registrdora.
	 * 
	 */
public void llenarCaja(){
	this.cantidadActual = this.capacidadMaxima;
}

	/**
	 * 
	 * El metodo secarModedas(int cantidadMonedas) simula sacar monedas de la caja 
	 * con la contidad indicada.
	 * 
	 * @param cantidadMonedas
	 * 
	 * Si la cantidad actual de € no alcanza para sacar la cantidad deseada,
	 * se saca lo que haya.
	 * 
	 */
public void sacarMonedas(int cantidadMonedas){
	if(cantidadMonedas > this.cantidadActual){
		vaciarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual - cantidadMonedas;
	}

}

	/**
	 * 
	 * El metodo vaciarCaja() pone la cantidad de € actual en cero.
	 * 
	 * De esta forma se consigue vaciar la cajaregistradora.
	 * 
	 */

public void vaciarCaja(){
	this.cantidadActual = 0;
}

	/**
	 * 
	 * El metodo agragarMonedas(int) simula la accion de añadir la cantidad de €
	 * indicada a la caja
	 * 
	 * @param cantidad
	 * 
	 *Si la cantidad actual mas la cantidad de € es mayor a la cantidad max, 
	 *se aagrega hasta llenar la caja
	 */

public void agregarMonedas(int cantidad){
	if (this.cantidadActual + cantidad > this.capacidadMaxima){
		llenarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual + cantidad;
	}
}

public static int getNumeroCajas() {
	return numCajas;
}
}
