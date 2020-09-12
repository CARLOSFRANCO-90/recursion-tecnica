package recursiontecnica;

public class MayorNumero {
public static void main(String[] args) {
		
		int [] numeros = {5,7,2,12,44,3,55};
		
		System.out.println(" Mayor numero: " + mayorNum(numeros,0, numeros[0]));

	}
	
	public static int mayorNum(int[] numeros, int indice,int maximo) {
		
		if(indice != numeros.length) {
			
			if(numeros[indice]> maximo) {
				maximo = mayorNum(numeros, indice + 1,numeros[indice]);
	
			
		    }else {
			    maximo = mayorNum(numeros, indice + 1, maximo);
			    }
		}
		return maximo;
	}	

}
