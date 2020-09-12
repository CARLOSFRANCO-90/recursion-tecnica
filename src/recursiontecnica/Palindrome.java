package recursiontecnica;

public class Palindrome {
	
	public static void main(String[] args) {
		 
		String nombre = "palabra";
		System.out.println(nombre);
		

	}
	
	public boolean palindromo (String cadena, int i, int d) {
		if(i<d) {
			if(cadena.charAt(i)==cadena.charAt(d)) {
				palindromo(cadena, i+1, d-1);
				return true;
			}
		}
		return false;
	}

}
