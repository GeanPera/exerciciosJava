import java.util.Scanner;

public class exercice04 {
	
	/*
	Tendo como dados de entrada a altura e o sexo de uma pessoa,
	construa um programa que calcule seu peso ideal, 
	utilizando as seguintes fórmulas:
		Para homens: (72.7*h) - 58
		Para mulheres: (62.1*h) - 44.7 (h = altura) 
	*/

	public static void main(String[] args) {
		char permissao = 's';
		while (permissao == 's' || permissao == 'S') {
			
			Scanner tc = new Scanner(System.in);
			System.out.println("Calcule o peso ideal");
			System.out.println("  ");
			System.out.println("Escolha o sexo:");
			System.out.println("F - feminino");
			System.out.println("M - masculino");
			System.out.println("  ");
			char sexo = tc.next().charAt(0);
			
			System.out.println("  ");
			System.out.println("Digite a altura:");
			System.out.println("  ");
			double altura = tc.nextDouble();
			
			if (sexo == 'F' || sexo == 'f') {
				calcularFeminino(altura);
			}
			if (sexo == 'M' || sexo == 'm') {
				calcularMasculino(altura);
			}
			permissao = 'n';
			System.out.println("  ");
			System.out.println("Deseja calcular outro IMC? s/n");
			System.out.println("  ");
			
			permissao = tc.next().charAt(0);
		}
		if (permissao != 's' && permissao != 'S') {
			System.out.println("Programa encerrado....");
		}
	}

	private static void calcularMasculino(double altura) {
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("  ");
		System.out.println("O peso ideal para um homen de " + altura + "m de altura é de " + pesoIdeal);
		System.out.println("  ");
		
	}

	private static void calcularFeminino(double altura) {
		double pesoIdeal = (62.1 * altura) - 44.7;
		System.out.println("  ");
		System.out.println("O peso ideal para uma mulher de " + altura + "m de altura é de " + pesoIdeal);
		System.out.println("  ");
		
	}

}
