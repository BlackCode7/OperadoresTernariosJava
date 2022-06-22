package OperadoresTernariosJava;

public class OperadoresTernariosJava {

	public static void main(String[] args) {
		
		int nota1 = 30;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* Condições lógicas com IF - se e ELSE - senao */
		if (media >= 70) {
			System.out.println("Aluno aprovado " + media);
		} else if(media >= 40 && media <= 50) {
			System.out.println("Aluno do recuperação " + media);
		} else {
			System.out.println("Aluno reprovado " + media);
		}
		
		/* Operadores ternários em java */
		String saidaResultado;
		saidaResultado = (media >= 70) ? "Aluno aprovado" : (media >= 40 && media <= 50) ? "Aluno em recuperação" : "Aluno Reprovado" ;
		System.out.println(saidaResultado);

		// OBS: ? equivale a VERDADEIRO, e : equivale ao FALSE
		
	}

}
