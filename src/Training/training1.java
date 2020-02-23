package Training;

import java.util.Arrays;
import java.util.Scanner;

public class training1 {
	
	public static void main(String[] args) {
        
        //Variables 
        String str;
        int x=0,i=0,numNew;
   	    Scanner read = new Scanner(System.in);
        
        System.out.print("Enter number:");
        str = read.nextLine();
        //System.out.println(str);
        
        int [] array = new int[str.length()];
        char[] aCaracteres = str.toCharArray();            
         
        for( i=0; i<str.length(); i++){
        array[i] = Character.getNumericValue(str.charAt(i));
        
        }
        
         Arrays.sort(array);
         
     System.out.println( "The Max combination is:");
         for (i = array.length - 1; i >= 0 ; i--) {
            System.out.print( array[i]);
            
        }
            System.out.println();
             
    }

}
