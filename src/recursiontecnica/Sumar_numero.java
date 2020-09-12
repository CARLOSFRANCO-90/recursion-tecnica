package recursiontecnica;

public class Sumar_numero {
	
public static void main(String[] args) {
		
		int n=10;
		int resultado = sumaNumero(n);
		System.out.println(resultado);

	}
	
	public static int sumaNumero(int numero) {
		
		int respuesta;
		
		if(numero==1) {
			return 1;
		}else {
			respuesta= numero + sumaNumero(numero-1);
		}
		
		return respuesta;
		
	}


}
