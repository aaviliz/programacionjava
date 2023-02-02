package primeraevaluecion;

public class Ejercicio3 {
	
	public static void pintarTablero(char[][] tablero) {
		
		for(int i=0; i<tablero.length; i++) {
			
			System.out.print("[");
			
			for(int j=0; j<tablero.length; j++) {
				
				System.out.print(tablero[i][j]);
				
				//Para no pintar la última ,
				
				if(j != tablero[i].length-1)
					
					System.out.print(", ");
			}
			
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		
		char tablero[][] = new char[10][10];
		
		for(int i=0; i < tablero.length;i++) {
			for(int j=0; j < tablero.length;j++) {
				tablero[i][j] = (char) 'a'; 
			}
			
		}
		
		pintarTablero(tablero);
		
	}
		public static void colocarBarco(int x, int y, String direccion , int longitudBarco, String letra, char[][] tablero) {
			
			if(direccion == "Abajo") {
				
				for(int i=y; i<y+2;i++) {
				tablero[x][i]='l';
				}
			}
			if(direccion=="Ariba") {
				
			
				for(int i=x; i<x+2;i++) {
				tablero[i][y]='s';
				}
			}
			if(direccion == "Derecha") {
				for(int i=0; i<longitudBarco;i++) {
				tablero[x][y+i]='c';
				}
			}
			if(direccion =="Izquierda") {
				for(int i=0; i<longitudBarco;i++) {
				tablero[x+i][y]='p';
					}
			}
			
			
		colocarBarco(1,1,"Abajo",3,"c",tablero);
		pintarTablero(tablero);
	}
		
}
