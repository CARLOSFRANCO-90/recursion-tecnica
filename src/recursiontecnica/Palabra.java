package recursiontecnica;

public class Palabra {
	
public static void main(String[] args) {
		
		int i=0;
		int j;
		int cont=0;
		String cadena="anitalavalatina";
		int tam=cadena.length();
		j=tam-1;
		do {
		System.out.println(cadena.charAt(i));
		if(cadena.charAt(i)==cadena.charAt(j)) {
			cont++;
			
		}
		i++;
		j--;
		}while(i<tam);
		
		System.out.println("contador: "+cont);
		if(cont==tam) {
			System.out.println("es palindrome");
		}
		
		else {
			System.out.println("no es palindrimo");
		}
		

	}


}
