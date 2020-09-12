package recursiontecnica;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		 int li=2, ls=100;
		 generaPrimos(li,ls);

	}
	
	static void generaPrimos(int li, int ls) {
		
		int contador = 0;
		for(int i=1; i<=li; i++) {
			
			if(li % i==0)
				contador++;
		}
		if(contador==2)
			System.out.println(li);
		li++;
		if(li<=ls)
			generaPrimos(li, ls);
	}


}
