package OperadoresTernariosJava.SwitchCaseJava;

public class SwitchCaseJava {

	public static void main(String[] args) {
		
		/*
		 CONFIGURAÇÂO DE NOVAS BRANCH NO ECLIPSE
		 REF >>>  http://www.mauda.com.br/?p=1814
		*/
		
		int nota1 = 30;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 80;
		int media = 0;		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		int dias = 1;
		
		/* Inclui código com switch case */
		switch (media) {
		case 1: System.out.println("Domingo");
			break;
		case 2: System.out.println("Segunda-Feira");
			break;
		case 3: System.out.println("Terça-Feira");
			break;
		case 4: System.out.println("Quarta-Feira");
			break;
		case 5: System.out.println("Quinta-Feira");
			break;
		case 6: System.out.println("Sexta-Feira");
			break;
		case 7: System.out.println("Sábado");
			break;
		default: System.out.println("Outro valor " + media);
			break;
		}		
		
		
		/* Operadores ternários em java */
		String saidaResultado;
		saidaResultado = (media >= 70) ? "Aluno aprovado" : (media >= 40 && media <= 50) ? "Aluno em recuperação" : "Aluno Reprovado" ;
		System.out.println(saidaResultado);

		// OBS: ? equivale a VERDADEIRO, e : equivale ao FALSE
		
	}

}


