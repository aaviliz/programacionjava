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
		
		System.out.println("Numero enemigos "+Enemigo.NumEnemi);
		
		System.out.println(enemi1);
		System.out.println(enemi2);
		
		enemi1.recibirDamage(400);
		enemi2.recibirDamage(110);
		
		System.out.println(enemi1);
		System.out.println(enemi2);
		
		System.out.println("Numero enemigo "+Enemigo.NumEnemi);
	}
}
