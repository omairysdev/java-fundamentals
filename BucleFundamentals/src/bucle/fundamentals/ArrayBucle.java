package bucle.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBucle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Saludo = "Hello World";
		
		//System.out.println(Saludo.charAt(11));
		
		//buclesAnidados();
		//unadimension();
		//bidimesional();
		//formejorado();
		//DoWile();
		MyFive();

	}

	private static void MyFive() {
		short ii;
		short jj=0;
		for (ii = 11; ii>6; ii-=1){
			jj++;
		}
		System.out.print("jj = " +jj);
	}

	private static void DoWile() {
		int ii= 2;
		do{
			System.out.print(ii);
		}while(ii>0);
		
	}

	private static void buclesAnidados() {
		int x=2,y=3,z=4;
		int j=0, k=0;
		for(int i=0; i<x; x++){
			do{
				k=0;
				while(k<z){
					k++;
					System.out.print(k + " ");
				}
				System.out.println(" ");
				j++;
			}while(j<y);
			System.out.println("----");
		}
		
	}

	private static void formejorado() {
		/*int[] ages = {27,12,82,1};
		
		for(int age : ages){
			System.out.println("Edad es " + age);	
		}*/
		
		ArrayList a1 = new ArrayList();
		a1.add("Uno");
		a1.add("Dos");
		a1.add("Tres");
		a1.add("Cuatro");
		a1.add("Cinco");
		
		for (Object cadena:a1)
		{
			System.out.println(cadena);
		}		
		
		
	}

	private static void bidimesional() {
		int [][] d2 = {{1,2,3},{4,5,6},{7,8},{9},{10,11,12}};
		
		//System.out.println(Arrays.toString(d2[0]));
		
		for(int i=0; i < d2.length; i++){
			//System.out.println(Arrays.toString(d2[i]));
		}
		
		/*for(int i=0; i < d2[1].length; i++){
			if(i== 0)
				System.out.print("[");
			
			System.out.print((d2[1][i]));
			
			if(i== d2[1].length-1)
				System.out.println("]");
			else
				System.out.print(", ");
				
		}
		*/
		for (int i=0; i < d2.length; i++){
			for (int j=0; j < d2[i].length; j++){
				System.out.print(d2[i][j]);
				System.out.print(" ");
			}
			System.out.println();			
		}
	}

	private static void unadimension() {
		int [] a ={1,2,3,4,5};
		int [] b= new int[6];
		
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
		for(int i=0; i < b.length; i++){
			b[i]= i*5;			
		}
		System.out.println(Arrays.toString((b)));
	}

}
