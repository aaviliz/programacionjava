/**
 * 
 */
package EjEmenugo;

/**
 * @author usuario1daw
 *
 */
public class Aplicaion {

	public static void main (String[] arg) {
		
		Enemigo enemi1 = new Enemigo("Drack", "Vampiro", 100, 0, 0);
		Enemigo enemi2 = new Enemigo("Isaac","Zombie", 120, 0, 0);
		
		for(int i=0;i<6;i++) {
			enemi1.subirNivel();
		}
		for(int i=0;i<2;i++) {
			enemi2.subirNivel();
		}
		
		
	}
}
