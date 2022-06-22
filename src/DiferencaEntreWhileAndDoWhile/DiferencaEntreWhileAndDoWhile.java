package DiferencaEntreWhileAndDoWhile;

public class DiferencaEntreWhileAndDoWhile {

	public static void main(String[] args) {
		
		int numero = 0;
		
		/* While - check first and later to do*/
		while( numero < 60) {
			System.out.println("Número atual > "+ numero);
			numero++; //conta até chegar 60
		}

		/* Do While - first to do later check true or false*/
		int numero2 = 0;
		do {
			System.out.println("Número atual > " + numero2);
			numero2++;
			
		} while(numero2 <= 60);
		
	}

}
