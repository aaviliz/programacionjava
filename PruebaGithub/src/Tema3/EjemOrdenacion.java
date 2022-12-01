package Tema3;

public class EjemOrdenacion {

	public static void burbuja (int numero[]) {
		
		int aux;
		for (int i=numero.length; i > 0; i--) {
			for (int j=0; j < i-1;j++) {
				if(numero[j]>numero[j+1]);
				//intercambiar
				aux = numero[j+1];
				numero[j+1]=numero[j];
				numero[j]=aux;
			}
		}
	}
	public static void main(String[] args) {
		
		int nums[]= new int[20];
		
		for(int i=0; i < nums.length;i++) {
			nums[i]=(int)(Math.random()*100)+1;
		
		System.out.println();
		
		}
		
	}

}
