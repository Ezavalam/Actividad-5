package actividad4;
    
public class Actividad5 {
	    public static void main(String[] args) {	    	
	    
	    	int[] numeros = new int[15];
	     	String[] nombres = new String[20];
	     	Circulo[] circulos = new Circulo[100];

	     	numeros[9] = 5;
	     	nombres[0] = "Francisco";
	     	
	     	System.out.print("Numeros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print(" " + numeros[i]);    
	         }
	    	
	        System.out.print("\n");
	        
	        System.out.print("Palabra: ");
	        for(int i = 0; i < nombres.length; i++) {
	        	if(nombres[i] == "Francisco") {
	        		System.out.print(nombres[i]);
	        	}
	        }
	        
	        System.out.print("\n");
	        
	       System.out.print("Eliminando valor:");
	       for (int i = 0; i < numeros.length; i++) {
	    	   if(numeros[i] != 5) {
	    		   System.out.print(" " + numeros[i]);
	    	   }
	                
	         }
	    }
}