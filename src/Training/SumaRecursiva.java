package Training;

public class SumaRecursiva {
	
	public static void main (String []args){
		int n=19;
		int resultado=sumaRecursiva(n);
		System.out.println(resultado);
			
	}

	public static int sumaRecursiva (int numero){
		int res;
		
		if (numero==4){
			return 1;
			
				}else{
					
					res= numero+sumaRecursiva(numero-1);
				}
		
		return res;
		
	}

}
