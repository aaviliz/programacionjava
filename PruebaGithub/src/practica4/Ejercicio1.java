package Practica4Ejs;

public class Ej1 {

	public static void main(String[] args) {

		int[] num=new int[10];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		num[5]=6;
		num[6]=7;
		num[7]=8;
		num[8]=9;
		num[9]=10
				;
		for (int i=0; i<10; i++) {
			System.out.println(num[i]);
		}
		for (int i=9;i>=0;i--) {
			System.out.println(num[i]);
		}
		
	}

}
