package Training;

import java.util.Scanner;

public class NumFibonnaci {
	
	public static void main (String args []){
		Scanner sc= new Scanner (System.in);
		System.out.print("Cuantos terminos desea: ");
		int n= sc.nextInt();
		int a= 0, b=1, c, s=1;
		System.out.print(a + "\t" +b);
		
		for (int i=2; i<=n; i++) {
				c=a+b;
				System.out.print (c + "\t");
				s+=c;
				a=b;
				b=c;
		}
			System.out.println ("\n la sumatoria es: " +s);
		}

}
