package recursiontecnica;

public class MinimoNumero {
	

	public static void main(String[] args) {
		
     int [] numeros = {5,7,2,12,44,3,55};
		
		System.out.println(" Menor numero: " + minimoNum(numeros,0, numeros[0]));

	}
	
	public static int minimoNum(int[] numeros, int indice,int minimo) {
		
		if(indice != numeros.length) {
			
			if(numeros[indice]< minimo) {
				minimo = minimoNum(numeros, indice + 1,numeros[indice]);
	
			
		    }else {
		    	minimo = minimoNum(numeros, indice + 1, minimo);
			    }
		}
		return minimo;
	}	


}
